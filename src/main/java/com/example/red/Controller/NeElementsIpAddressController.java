package com.example.red.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.NeElementsIpAddress;
import com.example.red.Service.NeElementsIpAddressService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class NeElementsIpAddressController {
	
	private final NeElementsIpAddressService neElementsIpAddressService;
	
	@GetMapping("/netelements/numoraddr")
	public ResponseEntity<List<NeElementsIpAddress>> findAllByBtsNumderOrIpAddress(@RequestParam(required=false) String btsNumOrIpAddress){
	
		String ipAddress = btsNumOrIpAddress;
		int btsNumber=0;
		try {btsNumber = Integer.parseInt(btsNumOrIpAddress);} catch (Exception ex) {btsNumber=99999999;}
		try { return new ResponseEntity<>(neElementsIpAddressService.findAllByBtsNumberOrIpAddress(btsNumber, ipAddress),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
	
	@GetMapping("/netelements/number")
	public ResponseEntity<List<NeElementsIpAddress>> findByBtsNumber(@RequestParam(required=false) int btsNumber){
	
		try { return new ResponseEntity<>(neElementsIpAddressService.findAllByBtsNumber(btsNumber),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}

}
