package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.Side;
import com.example.red.Repository.SideRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultSideService implements SideService {

	private final SideRepository sideRepository;

	@Override
	public Side getSideById(int id) {
		Side side = sideRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Нет данных"));
		return side;
	}

}
