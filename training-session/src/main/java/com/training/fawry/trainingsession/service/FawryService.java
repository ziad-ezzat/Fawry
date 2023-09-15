package com.training.fawry.trainingsession.service;

import com.training.fawry.trainingsession.entity.CityEntity;
import com.training.fawry.trainingsession.entity.TrainingUserEntity;
import com.training.fawry.trainingsession.repo.CityRepo;
import com.training.fawry.trainingsession.repo.TrainingUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FawryService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    TrainingUserRepo trainingUserRepo;

    public String getName(){
        return "Magued";
    }

    public List<CityEntity> getAllCities(){
        return cityRepo.findAll();
    }

    public void addUser(TrainingUserEntity trainingUserEntity){
        trainingUserRepo.save(trainingUserEntity);
    }

    public Optional<TrainingUserEntity> getUserByName(String name){
        return trainingUserRepo.findAllByName(name);
    }

}
