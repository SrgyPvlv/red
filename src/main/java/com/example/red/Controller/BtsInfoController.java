package com.example.red.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.red.Model.BtsInfo;
import com.example.red.Service.BtsInfoService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BtsInfoController {

private final BtsInfoService btsInfoService;
	
	@GetMapping("/btsinfos")
	public ResponseEntity<BtsInfo> getBtsInfoByBtsNumber(@RequestParam(required=false) int btsNumber){
	
		try { return new ResponseEntity<>(btsInfoService.getBtsInfoByBtsNumber(btsNumber),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
	
	@GetMapping("/btsinfos/number")
	public ResponseEntity<List<BtsInfo>> findAllByBtsNumber(@RequestParam(required=false) int btsNumber){
	
		try { return new ResponseEntity<>(btsInfoService.findAllByBtsNumber(btsNumber),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
	
	@GetMapping("/btsinfos/address")
	public ResponseEntity<List<BtsInfo>> findAllByBtsAddress(@RequestParam(required=false) String btsAddress){
	
		try { return new ResponseEntity<>(btsInfoService.findAllByBtsAddress(btsAddress),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
	
	@GetMapping("/btsinfos/numoraddr")
	public ResponseEntity<List<BtsInfo>> findAllByBtsNumderOrAddress(@RequestParam(required=false) String btsNumOrAddress){
	
		String btsAddress = btsNumOrAddress;
		int btsNumber=0;
		try {btsNumber = Integer.parseInt(btsNumOrAddress);} catch (Exception ex) {btsNumber=99999999;}
		try { return new ResponseEntity<>(btsInfoService.findAllByBtsNumderOrAddress(btsNumber, btsAddress),HttpStatus.OK);
		} catch (Exception ex) {return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
	}
}
