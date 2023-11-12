package com.example.wwsflotte.Controller;

import com.example.wwsflotte.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data: Cette annotation de Lombok combine plusieurs annotations en une seule. Elle génère automatiquement des méthodes telles que toString(), equals(), 
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String pseudo;
  private String password;
  private Role role;
}

