package com.anudip.Hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anudip.Hotelmanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
