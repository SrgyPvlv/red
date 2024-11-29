package com.example.red.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.KeyType;
import com.example.red.Service.AboutBtsKeysRelService;
import com.example.red.Service.KeyTypeService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class KeyTypeController {

private final KeyTypeService keyTypeService;
private final AboutBtsKeysRelService aboutBtsKeysRelService;
	
	@GetMapping("/keytypes")
	public ResponseEntity<List<KeyType>> getKeyTypesByAboutBtsId(@PathVariable int btsId){
	
		try { List<Integer> keysId = aboutBtsKeysRelService.getKeyIdByAboutBtsId(btsId);
		
		return new ResponseEntity<>(keysId.stream().map(e-> keyTypeService.getKeyTypeById(e)).collect(Collectors.toList()), HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
