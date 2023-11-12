package com.example.wwsflotte.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.wwsflotte.Entity.Vehicule;
import com.example.wwsflotte.Service.VehiculeService;
import com.example.wwsflotte.Work.ResponseWork;

@RestController
@RequestMapping(path="/flotte/vehicule")
public class VehiculeController {
    VehiculeService vehiculeService;

    @Autowired
    public VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService=vehiculeService;
    }

    @GetMapping("findone")
    public ResponseWork findOne(@RequestParam("matricule") String matricule){
        ResponseWork responseWork ;
        try {
            responseWork = new ResponseWork(null ,vehiculeService.findOne(matricule));
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
        
    }
    @GetMapping
    public ResponseWork findAll(){
        ResponseWork responseWork ;
        try {
            responseWork = new ResponseWork(null ,vehiculeService.findAll());
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
        
    }
    @PostMapping
    public ResponseWork insert(@RequestBody Vehicule vehicule){
        System.out.println("insertion vehicule");
        ResponseWork responseWork ;
        try {
            vehiculeService.insert(vehicule);
            responseWork = new ResponseWork(null ,"insert with succes");
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
        
    }
    @DeleteMapping
    public ResponseWork delete(@RequestParam("id") Long id){
        ResponseWork responseWork ;
        try {
            vehiculeService.delete(id);
            responseWork = new ResponseWork(null ,"delete with succes");
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
    }
    @PutMapping
    public ResponseWork modif(@RequestBody Vehicule vehicule){
        ResponseWork responseWork ;
        try {
            vehiculeService.modif(vehicule);;
            responseWork = new ResponseWork(null ,"update with succes");
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
        
    }
    // vehiculeService.getVehicule(matricule)
}
