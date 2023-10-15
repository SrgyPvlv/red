package com.example.red.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.red.Model.BtsContacts;
import com.example.red.Repository.BtsContactsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBtsContactsService implements BtsContactsService {

	private final BtsContactsRepository btsContactsRepository;
	
	@Override
	public BtsContacts getBtsContactsById(@PathVariable int id) {
		BtsContacts btscontact = btsContactsRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Нет данных"));
		return btscontact;
	}
}
