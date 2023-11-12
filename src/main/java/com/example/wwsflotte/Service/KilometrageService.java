package com.example.wwsflotte.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.wwsflotte.Entity.Kilometrage;
import com.example.wwsflotte.Repository.KilometrageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KilometrageService {
   private final KilometrageRepository kilometrageRepository;
   
   public void insert(Kilometrage kilometrage){
        kilometrageRepository.save(kilometrage);
   }
   public java.util.List<Kilometrage> allKilometrages(Long idvehicule){
        return kilometrageRepository.allKilometrage(idvehicule);
   }
   public void modif(Kilometrage kilometrage){
        kilometrageRepository.save(kilometrage);
   }
   public void delete(Long id){
        kilometrageRepository.deleteById(id);
   }
   public Optional<Kilometrage> findOne(Long id){
        return kilometrageRepository.findById(id);
   }

}
