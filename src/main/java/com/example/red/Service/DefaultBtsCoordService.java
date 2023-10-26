package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.BtsCoord;
import com.example.red.Repository.BtsCoordRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBtsCoordService implements BtsCoordService {

	public final BtsCoordRepository btsCoordRepository;
	
	@Override
	public BtsCoord getBtsCoordByBtsNumber(int btsNumber) {
		
		BtsCoord btsCoord = btsCoordRepository.findByBtsNumber(btsNumber);
		return btsCoord;
	}

}
