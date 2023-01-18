package com.anudip.Hotelmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.anudip.Hotelmanagement.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> { 

}