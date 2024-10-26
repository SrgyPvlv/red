package com.example.red.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Service.AboutBtsKeysRelService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AboutBtsKeysRelController {

	private final AboutBtsKeysRelService aboutBtsKeysRelService;
	
	@GetMapping("/aboutbtskeysrel")
	public ResponseEntity<List<Integer>> getKeyIdByAboutBtsId(@RequestParam(required=false) int btsId){
		try {return new ResponseEntity<>(aboutBtsKeysRelService.getKeyIdByAboutBtsId(btsId),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
