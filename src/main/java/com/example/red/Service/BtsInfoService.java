package com.example.red.Service;

import java.util.List;

import com.example.red.Model.BtsInfo;

public interface BtsInfoService {

	public BtsInfo getBtsInfoByBtsNumber(int btsNumber);
	public List<BtsInfo> findAllByBtsNumber(int btsNumber);
	public List<BtsInfo> findAllByBtsAddress(String bsAddress);
	public List<BtsInfo> findAllByBtsNumderOrAddress(int bsnum, String bsaddress);
}
