package com.springboot.hotelmanagement;

import com.springboot.hotelmanagement.enitity.Customer;
import com.springboot.hotelmanagement.enitity.Hotel;
import com.springboot.hotelmanagement.enitity.Room;
import com.springboot.hotelmanagement.repository.CustomerRepository;
import com.springboot.hotelmanagement.repository.HotelRepository;
import com.springboot.hotelmanagement.repository.RoomRepository;
import com.springboot.hotelmanagement.service.CustomerService;
import com.springboot.hotelmanagement.service.HotelService;
import com.springboot.hotelmanagement.service.RoomService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class HotelManagementApplicationTests {

	@Autowired
	private HotelService hotelService;

	@MockBean
	private HotelRepository hotelRepository;

	@Autowired
	private CustomerService customerService;

	@MockBean
	private CustomerRepository customerRepository;

	@Autowired
	private RoomService roomService;

	@MockBean
	private RoomRepository roomRepository;

  //Hotel Tests
	@Test
	void findAllTestHotel() {
		when(hotelRepository.findAll()).thenReturn(Stream.
				of(new Hotel("paradise", "hyderabad", 3.5), new Hotel("novotel", "miryalaguda", 4.5)).collect(Collectors.toList()));
		assertEquals(2, hotelService.findAll().size());
	}

	@Test
	@SuppressWarnings("squid:S2699")
	void saveTestHotel() {
		Hotel hotel = new Hotel("paradise", "hyderabad", 3.5);
		when(hotelRepository.save(any(Hotel.class))).thenReturn(hotel);
	}

	@Test
	void DeleteTestHotel() {
		int theId = 1;
		hotelService.deleteById(theId);
		verify(hotelRepository).deleteById(any());

	}


	//customer tests

	@Test
	void findAllTestCustomer() {
		when(customerRepository.findAll()).thenReturn(Stream.
				of(new Customer("harsha", "vardhan", "harshavardhan@gmail.com"), new Customer("mani", "deep", "manideep@gmail.com")).collect(Collectors.toList()));
		assertEquals(2, customerService.findAll().size());
	}

	@Test
	@SuppressWarnings("squid:S2699")
	void saveTestCustomer() {
		Customer customer = new Customer("sai", "rithish", "sairithish@gmail.com");
		when(customerRepository.save(customer)).thenReturn(customer);
	}

	@Test
	void DeleteTestCustomer() {
		int theId = 1;
		customerService.deleteById(theId);
		verify(customerRepository).deleteById(any());
	}


	//room tests
	@Test
	void findAllTestRoom() {
		when(roomRepository.findAll()).thenReturn(Stream.
				of(new Room(2,3), new Room(4,5)).collect(Collectors.toList()));
		assertEquals(2, roomService.findAll().size());
	}

	@Test
	@SuppressWarnings("squid:S2699")
	void saveTestRoom() {
		Room room = new Room(2,3);
		when(roomRepository.save(room)).thenReturn(room);
	}

	@Test
	void DeleteTestRoom() {
		int theId = 1;
		roomService.deleteById(theId);
		verify(roomRepository).deleteById(any());
	}
}
