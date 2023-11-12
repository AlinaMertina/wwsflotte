package com.example.wwsflotte.Repository;

import org.springframework.stereotype.Repository;

import  com.example.wwsflotte.Entity.Typecarburant;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TypecarburantRepository extends  JpaRepository<Typecarburant,Long> {
    
}
