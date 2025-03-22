package com.ram.auto.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageResponse {

	private String message;
	private Boolean status;

	
}
