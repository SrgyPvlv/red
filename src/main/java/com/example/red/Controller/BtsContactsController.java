package com.example.red.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.BtsContacts;
import com.example.red.Service.BtsContactsRelService;
import com.example.red.Service.BtsContactsService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BtsContactsController {
	
	private final BtsContactsService btsContactsService;
	private final BtsContactsRelService btsContactsRelService;
	
	@GetMapping("/btscontacts")
	public ResponseEntity<List<BtsContacts>> getBtsContactsByBsNumber(@RequestParam(required=false) int btsNumber){
	
		try { List<Integer> contactsId = btsContactsRelService.getBtsContactsIdByBtsNumber(btsNumber);
		
		return new ResponseEntity<>(contactsId.stream().map(e->btsContactsService.getBtsContactsById(e)).collect(Collectors.toList()),HttpStatus.OK);
	} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
}

}
