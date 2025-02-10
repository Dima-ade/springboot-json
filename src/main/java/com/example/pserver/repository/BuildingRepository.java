package com.example.pserver.repository;

import com.example.pserver.entity.BuildingEntity;
import com.example.pserver.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<BuildingEntity, Long>{

}
