package com.example.red.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.SiteType;
import com.example.red.Service.SiteTypeService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SiteTypeController {

	private final SiteTypeService siteTypeService;
	
	@GetMapping("/sitetypes/{id}")
	public ResponseEntity<SiteType> getSiteTypeById(@PathVariable int id){
	
		try { return new ResponseEntity<>(siteTypeService.getSiteTypeById(id),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
