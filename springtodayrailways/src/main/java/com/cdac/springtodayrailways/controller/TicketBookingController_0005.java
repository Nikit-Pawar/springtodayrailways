package com.cdac.springtodayrailways.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.springtodayrailways.dto.TicketBookingDTO_0005;
import com.cdac.springtodayrailways.entity.TicketBooking_0005;

@RestController
public class TicketBookingController_0005 {

	@Autowired
	TicketBookingDTO_0005 objTicketBookingDto;
	
	@GetMapping("/all")
	public List<TicketBooking_0005> getAllBookings()
	{
		return this.objTicketBookingDto.getAllBookings();
	}
	
	@GetMapping("/ticketbookingbyid/{ticketId}")
	public TicketBooking_0005 getBooking(@PathVariable Integer ticketId)
	{
		return objTicketBookingDto.getBooking(ticketId);
	}
	
	@PostMapping("/book")
	public TicketBooking_0005 addBooking(@RequestBody TicketBooking_0005 ticketBooking)
	{
		return this.objTicketBookingDto.addBooking(ticketBooking);
	}
	
}
