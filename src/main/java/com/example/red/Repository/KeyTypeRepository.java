package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.red.Model.KeyType;

@Repository
public interface KeyTypeRepository extends JpaRepository<KeyType, Integer> {

	
}
