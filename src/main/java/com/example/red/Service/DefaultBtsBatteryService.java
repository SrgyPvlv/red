package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.red.Model.BtsBattery;
import com.example.red.Repository.BtsBatteryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBtsBatteryService implements BtsBatteryService {

	private final BtsBatteryRepository btsBatteryRepository;

	@Override
	public List<BtsBattery> getBtsBatteryByBtsNumber(int btsNumber) {
		List<BtsBattery> btsBattery = btsBatteryRepository.findByBtsNumber(btsNumber);
		return btsBattery;
	}
	
	
}
