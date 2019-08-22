package com.example.jpaonetoonerelationship.repositories;

import com.example.jpaonetoonerelationship.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
