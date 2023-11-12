package com.example.wwsflotte.Service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.wwsflotte.Controller.AuthenticationRequest;
import com.example.wwsflotte.Controller.AuthenticationResponse;

import lombok.RequiredArgsConstructor;
import com.example.wwsflotte.Controller.RegisterRequest;
import com.example.wwsflotte.Entity.Role;
import com.example.wwsflotte.Entity.Utilisateur;
import com.example.wwsflotte.Repository.UtilisateurRepository;
import com.example.wwsflotte.Security.Config.Token.TokenRepository;
import com.example.wwsflotte.Security.Config.Token.TokenType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import  com.example.wwsflotte.Security.Config.Token.Token;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UtilisateurRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    private final TokenRepository tokenRepository;


    public AuthenticationResponse register(RegisterRequest request){
        Utilisateur user = Utilisateur.builder()
        .pseudo(request.getPseudo())
        .password(passwordEncoder.encode(request.getPassword()))
        .role(Role.USER)//tokony atao anaty base
        .build();
        var savedUser = repository.save(user);
        var jwtTokem = tokenService.generateToken(user);
        saveUserToken(savedUser, jwtTokem);
        return AuthenticationResponse.builder()
        .token(jwtTokem)
        .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request){
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
            request.getPseudo(),
            request.getPassword())

        );
        var user  = repository.findByPseudo(request.getPseudo())
                            .orElseThrow();
        System.out.println(user.getRole());
        var jwtTokem = tokenService.generateToken(user);

        saveUserToken(user, jwtTokem);
        return AuthenticationResponse.builder()
        .token(jwtTokem)
        .build();
    }
    private void saveUserToken(Utilisateur user, String jwtToken) {
        var token = Token.builder()
            .user(user)
            .token(jwtToken)
            .tokenType(TokenType.BEARER)
            .expired(false)
            .revoked(false)
            .build();
        tokenRepository.save(token);
    }
    // private void revokeAllUserTokens(Utilisateur user) {
    //     var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId().intValue());
    //     if (validUserTokens.isEmpty())
    //       return;
    //     validUserTokens.forEach(token -> {
    //       token.setExpired(true);
    //       token.setRevoked(true);
    //     });
    //     tokenRepository.saveAll(validUserTokens);
    //   }

//     public void refreshToken( HttpServletRequest request,HttpServletResponse response ) throws IOException {
//     final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//     final String refreshToken;
//     final String userEmail;
//     if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
//       return;
//     }
//     refreshToken = authHeader.substring(7);
//     userEmail = tokenService.extractUsername(refreshToken);
//     if (userEmail != null) {
//       var user = this.repository.findByPseudo(userEmail)
//               .orElseThrow();
//       if (tokenService.isTokenValid(refreshToken, user)) {
//         var accessToken = tokenService.generateToken(user);
//         revokeAllUserTokens(user);
//         saveUserToken(user, accessToken);
//         // var authResponse = AuthenticationResponse.builder()
//         //         .token(accessToken)
//         //         .refreshToken(refreshToken)
//         //         .build();
//         // new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
//       }
//     }
//   }
    
}
