package com.example.red.Service;

import java.util.List;

import com.example.red.Model.NeElementsIpAddress;

public interface NeElementsIpAddressService {

	public List<NeElementsIpAddress> findAllByBtsNumberOrIpAddress(int bsnum, String ipaddress);
	public List<NeElementsIpAddress> findAllByBtsNumber(int bsnum);
}
