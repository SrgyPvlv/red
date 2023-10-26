package com.example.red.Service;

import java.util.List;

import com.example.red.Model.BtsBattery;

public interface BtsBatteryService {

	public List<BtsBattery> getBtsBatteryByBtsNumber(int btsNumber);
}
