package com.example.spring.data.service.mapper;

import com.example.spring.data.common.CustomerModel;
import com.example.spring.data.repository.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Date;

@Mapper(componentModel = "spring")
public interface CustomerMapper {


	CustomerModel toModel(final Customer customer);

	Customer toEntity(final CustomerModel customer);

	//    @Mapping(target = "statusCode", source = "customer.status.code")
	//    @Mapping(source = "name", target = "name", qualifiedByName = "getName")

/*	@Named("getName")
	default String getName(String name) {
		return name + "x";
	}*/

}