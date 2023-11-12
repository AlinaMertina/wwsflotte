package com.example.wwsflotte.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

import com.example.wwsflotte.Security.Config.LogoutService;
import com.example.wwsflotte.Service.AuthenticationService;
import com.example.wwsflotte.Work.ResponseWork;

@RestController
@RequestMapping("/flotte/authentification")
@RequiredArgsConstructor
public class AuthenticationController {

   private final AuthenticationService service;
   

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register( @RequestBody RegisterRequest request) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
    return ResponseEntity.ok(service.authenticate(request));
  }

  
  

  // @PostMapping("/refresh-token")
  // public void refreshToken(HttpServletRequest request,HttpServletResponse response) throws IOException {
  //   service.refreshToken(request, response);
  // }
  // conecte
    
}
