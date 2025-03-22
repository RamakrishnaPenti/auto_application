package com.ram.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.auto.payload.request.AutoSaveRequest;
import com.ram.auto.payload.response.MessageResponse;
import com.ram.auto.services.AutoService;

@RequestMapping("/auto/v1")
@RestController
public class AutoController {

	@Autowired
	private AutoService autoService;

	@PostMapping(value = "/saveAuto")
	public MessageResponse saveAutoType(@RequestBody AutoSaveRequest request) {
		return autoService.saveAutoType(request);
	}

}
