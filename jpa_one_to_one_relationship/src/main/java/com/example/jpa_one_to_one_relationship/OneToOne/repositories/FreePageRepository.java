package com.example.jpa_one_to_one_relationship.OneToOne.repositories;

import com.example.jpa_one_to_one_relationship.OneToOne.models.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jpa_one_to_one_relationship.OneToOne.models.FreePage;

@Repository
public interface FreePageRepository extends JpaRepository<FreePage, Long>{

FreePage findByuser_id(Long user_id);



FreePage findbyidFreePage();
    
}
