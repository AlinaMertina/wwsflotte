package com.example.wwsflotte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.wwsflotte.Entity.Kilometrage;

public interface KilometrageRepository extends  JpaRepository<Kilometrage,Long>{
    @Query(value = "select * from kilometrage where idvehicule=:idvehicule", nativeQuery = true)
    java.util.List<Kilometrage> allKilometrage(@Param("idvehicule") Long idvehicule);

}
