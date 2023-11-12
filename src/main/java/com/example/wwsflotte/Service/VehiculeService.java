package com.example.wwsflotte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wwsflotte.Entity.Vehicule;
import com.example.wwsflotte.Repository.VehiculeRepository;

@Service
public class VehiculeService {

    VehiculeRepository vehiculeRepository;

    @Autowired
    public VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository=vehiculeRepository;
    }

    public java.util.List<Vehicule> findAll(){
        return vehiculeRepository.findAll();
    }

    public Vehicule findOne(String matricule){
        return vehiculeRepository.findByMatricule(matricule);
    }
    public void insert(Vehicule vehicule){
        vehiculeRepository.save(vehicule);
    }
    public void modif(Vehicule vehicule){
        vehiculeRepository.save(vehicule);
    }
    public void delete(Long id){
        vehiculeRepository.deleteById(id);
    }
}
