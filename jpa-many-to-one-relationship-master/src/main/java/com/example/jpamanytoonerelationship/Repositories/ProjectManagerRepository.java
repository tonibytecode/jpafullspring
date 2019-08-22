package com.example.jpamanytoonerelationship.Repositories;

import com.example.jpamanytoonerelationship.models.ProjectManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager, Long> {
    
}
