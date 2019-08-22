package com.example.jpamanytoonerelationship.Repositories;

import com.example.jpamanytoonerelationship.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
