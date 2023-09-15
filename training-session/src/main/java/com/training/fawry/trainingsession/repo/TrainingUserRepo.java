package com.training.fawry.trainingsession.repo;

import com.training.fawry.trainingsession.entity.TrainingUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainingUserRepo extends JpaRepository<TrainingUserEntity, Integer> {

    Optional<TrainingUserEntity> findAllByName(String name);

}
