package com.anudip.Hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.Hotelmanagement.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
}
