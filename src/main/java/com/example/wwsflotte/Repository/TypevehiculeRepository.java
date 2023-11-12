package com.example.wwsflotte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.wwsflotte.Entity.Typevehicule;

@Repository
public interface TypevehiculeRepository extends  JpaRepository<Typevehicule,Long>{
    
}
