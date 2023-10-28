package com.example.red.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.AmsType;
import com.example.red.Service.AmsTypeService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AmsTypeController {

	private final AmsTypeService amsTypeService;
	
	@GetMapping("/amstypes/{id}")
	public ResponseEntity<AmsType> getAmsTypeById(@PathVariable int id){
	
		try { return new ResponseEntity<>(amsTypeService.getAmsTypeById(id),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
