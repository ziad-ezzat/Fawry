package com.training.fawry.trainingsession.controller;

import com.training.fawry.trainingsession.entity.CityEntity;
import com.training.fawry.trainingsession.entity.TrainingUserEntity;
import com.training.fawry.trainingsession.service.FawryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class ApplicationController {

    @Autowired
    private FawryService fawryService;

    @GetMapping("/name")
    public String getName(){
        return fawryService.getName();
    }

    @GetMapping("/cities")
    public List<CityEntity> getCities(){
        return fawryService.getAllCities();
    }

    @PostMapping("/create/user")
    public ResponseEntity addUser(@RequestBody TrainingUserEntity trainingUserEntity){
        fawryService.addUser(trainingUserEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/name/{name}")
    public Optional<TrainingUserEntity> getUserByName(@PathVariable String name){
        return fawryService.getUserByName(name);
    }


}
