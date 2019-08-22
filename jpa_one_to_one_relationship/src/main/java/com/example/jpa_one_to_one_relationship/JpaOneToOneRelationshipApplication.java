package com.example.jpa_one_to_one_relationship;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa_one_to_one_relationship.OneToOne.models.FreePage;
import com.example.jpa_one_to_one_relationship.OneToOne.models.User;
import com.example.jpa_one_to_one_relationship.OneToOne.repositories.FreePageRepository;
import com.example.jpa_one_to_one_relationship.OneToOne.repositories.UserRepository;

@SpringBootApplication
public class JpaOneToOneRelationshipApplication implements CommandLineRunner{
    
    @Autowired
    private UserRepository users;
    
    @Autowired
    private FreePageRepository freePages;

    public static void main(String[] args) {
        SpringApplication.run(JpaOneToOneRelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Clean all data from tables
        this.freePages.deleteAllInBatch();
        this.users.deleteAllInBatch();
        
        // Create two users
        User user1 = new User("John", "Smith", "johnsmith@email.com", "john123");
        User user2 = new User("Linda", "Smith", "lindasmith@email.com", "linda123");
       
        // Create two free pages
        FreePage freePage1 = new FreePage("john-project", "https://www.johnsite.com");
        FreePage freePage2 = new FreePage("linda-project", "https://www.lindasite.com");
        
        // Set the free page to the respective user
        user1.setFreePage(freePage1);
        user2.setFreePage(freePage2);
        
        // Set the user for the respective page
        freePage1.setUser(user1);
        freePage2.setUser(user2);
        
        // Persist data to database
        this.users.save(user1);
        this.users.save(user2);
        
        System.out.println(this.freePages.findByuser_id(user2.getId()).getProjectName());
        System.out.println(this.freePages.findByuser_id(user1.getId()).getUrl());
        
        
    }
}
