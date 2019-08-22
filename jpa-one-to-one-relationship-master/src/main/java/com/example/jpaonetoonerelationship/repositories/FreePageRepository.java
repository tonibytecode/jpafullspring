package com.example.jpaonetoonerelationship.repositories;

import com.example.jpaonetoonerelationship.models.FreePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreePageRepository extends JpaRepository<FreePage, Long>{
    
}
