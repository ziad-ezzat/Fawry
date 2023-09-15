package com.example.spring.data.service.impl;

import com.example.spring.data.common.CustomerModel;
import com.example.spring.data.repository.CustomerRepository;
import com.example.spring.data.repository.entity.Customer;
import com.example.spring.data.service.CustomerService;
import com.example.spring.data.service.mapper.CustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerMapper customerMapper;

	@Override
	public CustomerModel findCustomerByMobile(String mobileNumber) {
		return customerMapper.toModel(customerRepository.findByMobile(mobileNumber).orElseGet(null));
	}

	@Override
	public List<CustomerModel> findAllCustomers() {
		return customerRepository.findAll()
				.stream()
				.map(customer -> customerMapper.toModel(customer))
				.collect(Collectors.toList());
	}

	@Override
	public CustomerModel updateCustomer(CustomerModel customerModel) {
		Customer customer = customerMapper.toEntity(customerModel);
		return customerMapper.toModel(customerRepository.save(customer));
	}

	@Override
	public CustomerModel updateCustomerCustom(CustomerModel customerModel) {
		customerRepository.updateCustomerCustom(customerModel.getMobileNumber(), customerModel.getEmail());
		return findCustomerByMobile(customerModel.getMobileNumber());
	}

	@Override
	public CustomerModel insertCustomer(CustomerModel customerModel) {
		Customer customer = customerMapper.toEntity(customerModel);
		return customerMapper.toModel(customerRepository.save(customer));
	}

	@Override
	public void deleteCustomer(String mobileNumber) throws Exception {
		Customer customer = customerRepository.findByMobile(mobileNumber).orElseThrow(() -> new Exception("customer not found"));
		customerRepository.delete(customer);
	}
}
