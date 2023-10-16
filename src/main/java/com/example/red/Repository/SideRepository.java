package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.red.Model.Side;

@Repository
public interface SideRepository extends JpaRepository<Side, Integer> {

}
