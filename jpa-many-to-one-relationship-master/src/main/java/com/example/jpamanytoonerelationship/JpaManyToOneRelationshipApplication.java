package com.example.jpamanytoonerelationship;

import com.example.jpamanytoonerelationship.Repositories.ProjectManagerRepository;
import com.example.jpamanytoonerelationship.Repositories.ProjectRepository;
import com.example.jpamanytoonerelationship.models.Project;
import com.example.jpamanytoonerelationship.models.ProjectManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaManyToOneRelationshipApplication implements CommandLineRunner{
    
    @Autowired
    private ProjectManagerRepository managers;
    
    @Autowired
    private ProjectRepository projects;

    public static void main(String[] args) {
        SpringApplication.run(JpaManyToOneRelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        // Clean the database on start up
        this.projects.deleteAllInBatch();
        this.managers.deleteAllInBatch();
        
        // Create two managers
        ProjectManager manager1 = new ProjectManager("John", "Smith");
        ProjectManager manager2 = new ProjectManager("Linda", "O'Donnel");
        
        // Persist the managers on database
        this.managers.save(manager1);
        this.managers.save(manager2);
        
        // Create four projects
        Project project1 = new Project("Project 1");
        Project project2 = new Project("Project 2");
        Project project3 = new Project("Project 3");
        Project project4 = new Project("Project 4");
        
        // Assign manager to projects
        project1.setProjectManager(manager1);
        project2.setProjectManager(manager1);
        project3.setProjectManager(manager2);
        project4.setProjectManager(manager2);
        
        // Persist the projects on database
        this.projects.save(project1);
        this.projects.save(project2);
        this.projects.save(project3);
        this.projects.save(project4);
        
        // Change the manager for project 1 and project 2.
        project1.setProjectManager(manager2);
        project2.setProjectManager(manager2);
        
        // Persist the changes to database
        this.projects.save(project1);
        this.projects.save(project2);
        
        // Delete manager 1 from database
        this.managers.delete(manager1);
        
    }
    
}
