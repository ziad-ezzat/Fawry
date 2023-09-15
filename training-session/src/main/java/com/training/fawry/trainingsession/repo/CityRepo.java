package com.training.fawry.trainingsession.repo;

import com.training.fawry.trainingsession.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<CityEntity, Integer> {
}
