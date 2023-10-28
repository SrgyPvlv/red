package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.AmsType;
import com.example.red.Repository.AmsTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultAmsTypeService implements AmsTypeService {

	private final AmsTypeRepository amsTypeRepository;

	@Override
	public AmsType getAmsTypeById(int id) {
		AmsType amsType = amsTypeRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Нет данных"));
		return amsType;
	}
}
