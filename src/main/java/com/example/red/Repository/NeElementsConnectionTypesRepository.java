package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.red.Model.NeElementsConnectionTypes;

@Repository
public interface NeElementsConnectionTypesRepository extends JpaRepository<NeElementsConnectionTypes,Integer> {

}
