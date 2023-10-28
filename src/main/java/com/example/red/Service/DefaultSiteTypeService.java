package com.example.red.Service;

import org.springframework.stereotype.Service;

import com.example.red.Model.SiteType;
import com.example.red.Repository.SiteTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultSiteTypeService implements SiteTypeService {
	
	private final SiteTypeRepository siteTypeRepository;
	
	@Override
	public SiteType getSiteTypeById(int id) {
		
		SiteType siteType = siteTypeRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Нет данных"));
		return siteType;
	}

}
