package com.anudip.Hotelmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.Hotelmanagement.entity.Customer;
import com.anudip.Hotelmanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImplement implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer user) {
		return customerRepository.save(user);
	}

	@Override
	public Boolean removeCustomer(Long customerId) {
		customerRepository.deleteById(customerId);
		return true;
	}

	@Override
	public Customer updateCustomer(Long customerId, Customer user) {
		Customer getData = getCustomer(customerId);
		Customer updateData = new Customer();
		if (getData != null) {
			// ID cannot be updated
			updateData.setCustomerId(customerId);
			updateData.setName(user.getName());
			updateData.setAge(user.getAge());
			updateData.setContact(user.getContact());
			updateData.setGender(user.getGender());
			updateData.setCity(user.getCity());
		}
		return customerRepository.save(updateData);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(Long customerId) {
		return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Id not found!!!"));
	}
}
