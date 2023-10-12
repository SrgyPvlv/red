package com.example.red.Service;

import java.util.List;

import com.example.red.Model.Route;

public interface RouteService {

	public List<Route> getRouteByBtsNumber(int btsNumber);
}
