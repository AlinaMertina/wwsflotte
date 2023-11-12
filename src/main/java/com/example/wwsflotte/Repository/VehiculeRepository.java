package com.example.wwsflotte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.wwsflotte.Entity.Vehicule;

@Repository
public interface VehiculeRepository extends  JpaRepository<Vehicule,Long>{

    @Query(value = "select * from vehicule where matricule=:matricule limit 1", nativeQuery = true)
    Vehicule findByMatricule(@Param("matricule") String matricule);

    
}
