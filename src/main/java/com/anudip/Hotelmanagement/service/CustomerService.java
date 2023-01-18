package com.anudip.Hotelmanagement.service;

import java.util.List;

import com.anudip.Hotelmanagement.entity.Customer;

public interface CustomerService {
	Customer addCustomer(Customer user);
	Boolean removeCustomer(Long customerId);
	Customer updateCustomer(Long customerId, Customer user);
	List<Customer> getAllCustomer();
	Customer getCustomer(Long customerId);
}