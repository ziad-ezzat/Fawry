package com.example.spring.data.rest;

import com.example.spring.data.common.CustomerModel;
import com.example.spring.data.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
@Slf4j
public class CustomerResource {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	List<CustomerModel> findAllCustomers() {
		return customerService.findAllCustomers();
	}

	@GetMapping("{mobileNumber}")
	CustomerModel findCustomerByMobile(@PathVariable("mobileNumber") String customerMobileNumber) {
		return customerService.findCustomerByMobile(customerMobileNumber);
	}

	@PostMapping
	CustomerModel addCustomer(@RequestBody CustomerModel customerModel) {
		return customerService.insertCustomer(customerModel);
	}

	@PutMapping
	CustomerModel updateCustomer(@RequestBody CustomerModel customerModel) {
		return customerService.updateCustomer(customerModel);
	}

	@PutMapping("custom")
	CustomerModel updateCustomerCustom(@RequestBody CustomerModel customerModel) {
		return customerService.updateCustomerCustom(customerModel);
	}

	@DeleteMapping("{mobileNumber}")
	public void deleteCustomer(@PathVariable("mobileNumber") String customerMobileNumber) throws Exception {
		customerService.deleteCustomer(customerMobileNumber);
	}


}
