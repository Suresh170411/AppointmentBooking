package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {

	@Id
	private Integer id;
	private String name;
	private Integer age;
	private Integer fee;
}
