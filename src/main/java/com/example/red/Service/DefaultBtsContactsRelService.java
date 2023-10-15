package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.red.Repository.BtsContactsRelRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBtsContactsRelService implements BtsContactsRelService {
	
	private final BtsContactsRelRepository btsContactsRelRepository;
	
	@Override
	public List<Integer> getBtsContactsIdByBtsNumber(int btsNumber) {
		List<Integer> btsContactsId = btsContactsRelRepository.findContactsIdByBtsNumber(btsNumber);
		return btsContactsId;
	}

}
