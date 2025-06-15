package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.red.Model.NeElementsIpAddress;
import com.example.red.Repository.NeElementsIpAddressRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultNeElementsIpAddressService implements NeElementsIpAddressService{

	private final NeElementsIpAddressRepository neElementsIpAddressRepository;

	@Override
	public List<NeElementsIpAddress> findAllByBtsNumberOrIpAddress(int bsnum, String ipaddress) {
		
		List<NeElementsIpAddress> netelements = neElementsIpAddressRepository.findAllByBtsNumberOrIpAddress(bsnum, ipaddress);
		return netelements;
	}

	@Override
	public List<NeElementsIpAddress> findAllByBtsNumber(int bsnum) {
		
		List<NeElementsIpAddress> netelements = neElementsIpAddressRepository.findAllByBtsNumber(bsnum);
		return netelements;
	}
	
	
	
}
