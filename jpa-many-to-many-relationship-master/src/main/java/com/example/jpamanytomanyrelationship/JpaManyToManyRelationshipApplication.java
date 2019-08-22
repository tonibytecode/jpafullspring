package com.example.jpamanytomanyrelationship;

import com.example.jpamanytomanyrelationship.models.Developer;
import com.example.jpamanytomanyrelationship.models.Project;
import com.example.jpamanytomanyrelationship.repositories.DeveloperRepository;
import com.example.jpamanytomanyrelationship.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaManyToManyRelationshipApplication implements CommandLineRunner{
    
    @Autowired
    ProjectRepository projects;
    
    @Autowired
    DeveloperRepository developers;

    public static void main(String[] args) {
        SpringApplication.run(JpaManyToManyRelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        // Clean the database storage
        this.projects.deleteAllInBatch();
        this.developers.deleteAllInBatch();
        
        ////////////////
        
        // Create 5 developers
        Developer dev1 = new Developer("John", "Smith");
        Developer dev2 = new Developer("Peter", "Hook");
        Developer dev3 = new Developer("Joshua", "Cage");
        Developer dev4 = new Developer("Nikola", "Pigeon");
        Developer dev5 = new Developer("Paul", "Lennon");
        
        ////////////////
        
        // Create 3 projects

        Project project1 = new Project("Project1", "https://www.project1.com");
        Project project2 = new Project("Project2", "https://www.project2.com");
        Project project3 = new Project("Project3", "https://www.project3.com");
        
        this.projects.save(project1);
        this.projects.save(project2);
        this.projects.save(project3);

        // Assign developers to projects
        project1.getDevelopers().add(dev1);
        
        project2.getDevelopers().add(dev2);
        project2.getDevelopers().add(dev3);
        
        project3.getDevelopers().add(this.developers.getOne(2L));
        project3.getDevelopers().add(dev4);
        project3.getDevelopers().add(dev5);
        
        // Persist the projects
        this.projects.save(project1);
        this.projects.save(project2);
        this.projects.save(project3);
        
        // Delete developer id 1
        this.developers.deleteById(1L);

        // Delete project id 2
        this.projects.deleteById(2L);

    }
    
}
