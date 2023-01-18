package com.anudip.Hotelmanagement.service;

import com.anudip.Hotelmanagement.entity.Hotel;

public interface HotelService {
	Hotel addHotel(Hotel hotel);
	Boolean removeHotel(Long hotelId);
	Hotel getHotel(Long hotelId);
}
