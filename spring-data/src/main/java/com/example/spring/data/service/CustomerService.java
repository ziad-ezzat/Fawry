package com.example.spring.data.service;


import com.example.spring.data.common.CustomerModel;

import java.util.List;

public interface CustomerService {


	List<CustomerModel> findAllCustomers();

	CustomerModel updateCustomerCustom(CustomerModel customerModel);
}
