package com.example.jpamanytomanyrelationship.repositories;

import com.example.jpamanytomanyrelationship.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long>{
    
}
