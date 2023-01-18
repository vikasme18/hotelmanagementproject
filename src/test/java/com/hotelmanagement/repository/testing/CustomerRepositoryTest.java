package com.hotelmanagement.repository.testing;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.anudip.Hotelmanagement.entity.Customer;
import com.anudip.Hotelmanagement.repository.CustomerRepository;

@SpringBootTest
class CustomerRepositoryTest {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer customer() {
		Customer customer = new Customer();
		customer.setCustomerId(7897);
		customer.setName("Vikas Meena");
		customer.setAge((byte) 21);
		customer.setContact(8769543422L);
		customer.setGender("male");
		customer.setCity("kalyan");
		return customer;
	}
	
	@Test
	void saveCustomer() {
		customerRepo.save(customer());
		Boolean actual = customerRepo.existsById((long) 7897);
		assertThat(actual).isTrue();
	}
	
	@Test
	void deleteCustomer() {
		customerRepo.deleteById((long) 7897);
		Boolean actual = customerRepo.existsById((long) 7897);
		assertThat(actual).isFalse();
	}
	
}
