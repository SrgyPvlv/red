package com.example.red.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.Route;
import com.example.red.Service.RouteService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class RouteController {

	private final RouteService routeService;
	
	@GetMapping("/routes")
	public ResponseEntity<List<Route>> getRouteByBtsNumber(@RequestParam(required=false) int btsNumber){
	
		try { return new ResponseEntity<>(routeService.getRouteByBtsNumber(btsNumber),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
	
}
