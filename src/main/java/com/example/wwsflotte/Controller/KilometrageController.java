package com.example.wwsflotte.Controller;

import com.example.wwsflotte.Entity.Kilometrage;
import com.example.wwsflotte.Entity.Vehicule;
import com.example.wwsflotte.Service.KilometrageService;
import com.example.wwsflotte.Work.ResponseWork;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/flotte/kilometrage")
public class KilometrageController {
    private final KilometrageService kilometrageService;

    @GetMapping
    public ResponseWork findAll(@RequestParam("id") Long id){
        ResponseWork responseWork ;
        try {
            responseWork = new ResponseWork(null ,kilometrageService.findOne(id) );
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
    }

    @PostMapping
    public ResponseWork insert(@RequestBody Kilometrage kilometrage){
        ResponseWork responseWork ;
        try {
            kilometrageService.insert(kilometrage);
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
            kilometrageService.delete(id);
            responseWork = new ResponseWork(null ,"delete with succes");
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
    }

    @PutMapping
    public ResponseWork modif(@RequestBody Kilometrage vehicule){
        ResponseWork responseWork ;
        try {
            kilometrageService.modif(vehicule);;
            responseWork = new ResponseWork(null ,"update with succes");
        } catch (Exception e) {
            responseWork= new ResponseWork(e.getMessage(),null);
            return responseWork;
        }
        return responseWork;
        
    }
}
