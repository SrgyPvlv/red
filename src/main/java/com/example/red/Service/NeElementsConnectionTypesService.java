package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.NeElementsConnectionTypes;

@Service
public interface NeElementsConnectionTypesService {

	public NeElementsConnectionTypes getNeElementsConnectionTypesById(int id); 
}
