package com.example.jpa_one_to_one_relationship.OneToOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa_one_to_one_relationship.OneToOne.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
	String findByfreePage(Long IdPage);
}
