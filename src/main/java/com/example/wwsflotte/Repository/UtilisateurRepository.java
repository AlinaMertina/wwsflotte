package com.example.wwsflotte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wwsflotte.Entity.Utilisateur;



public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{

    java.util.Optional<Utilisateur> findByPseudo(String pseudo);
    
}
