package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.red.Model.AmsType;

@Repository
public interface AmsTypeRepository extends JpaRepository<AmsType,Integer> {

	
}
