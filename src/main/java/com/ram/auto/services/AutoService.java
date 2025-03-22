package com.ram.auto.services;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.auto.entity.Auto;
import com.ram.auto.payload.request.AutoSaveRequest;
import com.ram.auto.payload.response.MessageResponse;
import com.ram.auto.repo.AutoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AutoService {

	@Autowired
	private AutoRepository autoRepository;

	public MessageResponse saveAutoType(AutoSaveRequest autoSaveRequest) {
		try {
			log.info("saveAutoType() is started");
			Auto auto = new Auto();
			auto.setCreatedAt(Date.from(Instant.now()));
			auto.setPrice(autoSaveRequest.getPrice());
			auto.setType(autoSaveRequest.getType());
			auto.setUpdatedAt(null);
			auto.setId(autoSaveRequest.getId());
			auto.setYearOfModel(autoSaveRequest.getYearOfModel());
			autoRepository.save(auto);
			log.info("saveAutoType() is ended");
			return new MessageResponse("auto is saved successfully", true);
		} catch (Exception e) {
			e.printStackTrace();
			return new MessageResponse("auto is save failed", false);
		}
	}
}
