package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.Route;
import com.example.red.Repository.RouteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultRouteService implements RouteService {
	
	private final RouteRepository routeRepository;
	
	@Override
	public Route getRouteByBtsNumber(int btsNumber) {
		Route route = routeRepository.findByBtsNumber(btsNumber);
		return route;
	}

}
