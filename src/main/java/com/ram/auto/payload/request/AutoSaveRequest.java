package com.ram.auto.payload.request;

import lombok.Data;

@Data
public class AutoSaveRequest {
	private Long id;
	private String type;
	private String yearOfModel;
	private Double price;

}
