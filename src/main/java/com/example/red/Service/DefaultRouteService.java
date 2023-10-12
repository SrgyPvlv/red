package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.red.Model.Route;
import com.example.red.Repository.RouteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultRouteService implements RouteService {
	
	private final RouteRepository routeRepository;
	
	@Override
	public List<Route> getRouteByBtsNumber(int btsNumber) {
		List<Route> routes = routeRepository.findByBtsNumber(btsNumber);
		return routes;
	}

}
