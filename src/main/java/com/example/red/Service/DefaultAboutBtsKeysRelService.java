package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.red.Repository.AboutBtsKeysRelRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultAboutBtsKeysRelService implements AboutBtsKeysRelService  {

	private final AboutBtsKeysRelRepository aboutBtsKeysRelRepository;
	
	@Override
	public List<Integer> getKeyIdByAboutBtsId(@PathVariable int btsId) {
		
		List<Integer> keyId = aboutBtsKeysRelRepository.findKeyIdByAboutBtsId(btsId);
		
		return keyId;
	}

}
