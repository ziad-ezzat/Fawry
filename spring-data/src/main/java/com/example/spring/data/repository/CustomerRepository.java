package com.example.spring.data.repository;

import com.example.spring.data.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Modifying
	@Query(value = "UPDATE Customer c SET c.email = ?2 WHERE c.mobile = ?1")
	void updateCustomerCustom(String mobileNumber, String email);

	Optional<Customer> findByMobile(String mobile);

	Optional<Customer> findByMobileAndMerchantAccountNumber(String mobile);

	//Optional<Customer> findByMobileAndMerchantAccountNumber(String mobile, String accountNumber);

	//List<Customer> findByMobileInAndMerchantAccountNumber(List<String> mobiles, String merchantAccountNumber);

	/*

		@Query("SELECT c FROM Customer c "
			+ "WHERE ?1 >= LAST_MODIFICATION_DATE "
			+ "AND c.customerTypeLookup.code = 'REGISTERED'"
			+ "AND c.status.code = 'INACTIVE' " )
			List<Customer> findInActiveCustomers(Date configuredDateToRemoveCustomer);
	 */

}