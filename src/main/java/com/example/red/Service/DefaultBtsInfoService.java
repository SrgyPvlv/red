package com.example.red.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.red.Model.BtsInfo;
import com.example.red.Repository.BtsInfoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBtsInfoService implements BtsInfoService {

	private final BtsInfoRepository btsInfoRepository;
	
	@Override
	public BtsInfo getBtsInfoByBtsNumber(int btsNumber) {
		BtsInfo btsinfos = btsInfoRepository.findByBtsNumber(btsNumber);
		return btsinfos;
	}

	@Override
	public List<BtsInfo> findAllByBtsAddress(String bsAddress) {
		List<BtsInfo> btsinfos = btsInfoRepository.findAllByBtsAddress(bsAddress);
		return btsinfos;
	}

	@Override
	public List<BtsInfo> findAllByBtsNumber(int btsNumber) {
		List<BtsInfo> btsinfos = btsInfoRepository.findAllByBtsNumber(btsNumber);
		return btsinfos;
	}

	@Override
	public List<BtsInfo> findAllByBtsNumderOrAddress(int bsnum, String bsaddress) {
		List<BtsInfo> btsinfos = btsInfoRepository.findAllByBtsNumderOrAddress(bsnum, bsaddress);
		return btsinfos;
	}

}
