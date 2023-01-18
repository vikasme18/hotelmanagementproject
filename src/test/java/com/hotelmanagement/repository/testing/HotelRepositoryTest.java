package com.hotelmanagement.repository.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.anudip.Hotelmanagement.entity.Hotel;
import com.anudip.Hotelmanagement.repository.HotelRepository;

@SpringBootTest
class HotelRepositoryTest {
	
	@Autowired
	private HotelRepository hotelRepo;
	
	public Hotel hotel() {
		Hotel hotel = new Hotel();
		hotel.setId(54678);
		hotel.setName("Om sai hotel");
		hotel.setManagerName("Ashutosh Mishra");
		hotel.setLocation("Jaipur");
		return hotel;
	}

	@Test
	void saveTest() {
		hotelRepo.save(hotel());
		Boolean actual = hotelRepo.existsById((long) 54678);
		assertThat(actual).isTrue();
	}
	
	@Test
	void removeTest() {
		hotelRepo.deleteById((long) 54678);
		Boolean actual = hotelRepo.existsById((long) 54678);
		assertThat(actual).isFalse();
	}
	
}