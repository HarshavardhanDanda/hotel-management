package com.springboot.hotelmanagement;

import com.springboot.hotelmanagement.enitity.Hotel;
import com.springboot.hotelmanagement.repository.HotelRepository;
import com.springboot.hotelmanagement.service.HotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;



@SpringBootTest
class HotelManagementApplicationTests {

	@Autowired
	private HotelService hotelService;

	@MockBean
	private HotelRepository hotelRepository;


	@Test
	public void findAllTest() {
		when(hotelRepository.findAll()).thenReturn(Stream.
				of(new Hotel("paradise", "hyderabad", 3.5), new Hotel("novotel", "miryalaguda", 4.5)).collect(Collectors.toList()));
		assertEquals(2, hotelService.findAll().size());
	}


    @Test
	public void saveTest(){
		Hotel hotel= new Hotel("paradise", "hyderabad", 3.5);
		when(hotelRepository.save(hotel)).thenReturn(hotel);
	}
	
	@Test
	public void DeleteTest(){
		int theId=1;
		hotelService.deleteById(theId);
		Hotel theHotel= hotelRepository.getById(1);

	}
}
