package com.ram.auto.entity;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseObject {
	@Id
	private Long id;
	private Date createdAt;

	private Date updatedAt;
}
