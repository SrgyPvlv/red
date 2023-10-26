package com.example.red.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.BtsCoord;
import com.example.red.Service.BtsCoordService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BtsCoordController {
	
	private final BtsCoordService btsCoordService;

	@GetMapping("/btscoordinates")
	public ResponseEntity<BtsCoord> getBtsCoordByBtsNumber(@RequestParam(required=false) int btsNumber){
	
		try {return new ResponseEntity<>(btsCoordService.getBtsCoordByBtsNumber(btsNumber),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
