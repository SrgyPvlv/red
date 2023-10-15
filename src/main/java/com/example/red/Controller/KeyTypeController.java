package com.example.red.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.KeyType;
import com.example.red.Service.KeyTypeService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class KeyTypeController {

private final KeyTypeService keyTypeService;
	
	@GetMapping("/keytypes/{id}")
	public ResponseEntity<KeyType> getKeyTypeById(@PathVariable int id){
	
		try { return new ResponseEntity<>(keyTypeService.getKeyTypeById(id),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
