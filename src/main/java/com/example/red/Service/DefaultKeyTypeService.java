package com.example.red.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.red.Model.KeyType;
import com.example.red.Repository.KeyTypeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultKeyTypeService implements KeyTypeService{
	
	private final KeyTypeRepository keyTypeRepository;
	
	@Override
	public KeyType getKeyTypeById(@PathVariable int id) {
		KeyType keytype = keyTypeRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Нет данных"));
		return keytype;
	}

}
