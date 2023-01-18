package com.anudip.Hotelmanagement.service;

import org.springframework.stereotype.Service;
import com.anudip.Hotelmanagement.entity.Hotel;
import com.anudip.Hotelmanagement.repository.HotelRepository;

@Service
public class HotelServiceImplement implements HotelService {
	private HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		
		return hotelRepository.save(hotel);
	}

	@Override
	public Boolean removeHotel(Long hotelId) {
		hotelRepository.deleteById(hotelId);
		return true;
	}

	@Override
	public Hotel getHotel(Long hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(() -> new RuntimeException("Id not found!!!"));
	}
	
}
