package com.anudip.Hotelmanagement.service;

import java.util.List;
import com.anudip.Hotelmanagement.entity.Booking;

	public interface BookingService {
		Booking saveOrder(Booking order);
		Booking updateOrder(Long bookingId, Booking order);
		Booking getOrder(Long bookingId);
		List<Booking> getAllOrder();
		Boolean deleteOrder(Long bookingId);
	}
