package com.anudip.Hotelmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.Hotelmanagement.entity.Booking;
import com.anudip.Hotelmanagement.repository.BookingRepository;

@Service
public class BookingServiceImplement implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public List<Booking> getAllOrder() {
		return bookingRepository.findAll();
	}
	
	@Override
	public Booking getOrder(Long bookingId) {
		return bookingRepository.findById(bookingId).orElseThrow(() -> new RuntimeException("Id not found!!!"));
	}
	
	@Override
	public Booking saveOrder(Booking order) {
		return bookingRepository.save(order);
	}

	@Override
	public Booking updateOrder(Long bookingId, Booking order) {
		Booking getdata = getOrder(bookingId);
		Booking updateData = new Booking();
		if (getdata != null) {
			// ID cannot be updated
			updateData.setBookingId(bookingId);
			updateData.setGuestName(order.getGuestName());
			updateData.setGuestIdProof(order.getGuestIdProof());
			updateData.setAddress(order.getAddress());
			updateData.setPrice(order.getPrice());
			updateData.setContact(order.getContact());
			updateData.setCustomer(getdata.getCustomer());
			updateData.setHotel(getdata.getHotel());
		}
		return bookingRepository.save(updateData);
	}

	@Override
	public Boolean deleteOrder(Long bookingId) {
		bookingRepository.deleteById(bookingId);
		return true;
	}
	
}
