package com.example.spring.data.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerModel {

	private Long id;

	private String name;

	@NotBlank(message = "Customer mobile is required")
	@Pattern(regexp = "^\\+?(?:[0-9] ?){6,14}[0-9]$", message = "invalid customer mobile")
	private String mobile;

	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Invalid customer email")
	private String email;


	private String mobileNumber;

}
