package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Integer userId;
	private String userName;
	private String email;
	private String mobile;
	private String password;
}
