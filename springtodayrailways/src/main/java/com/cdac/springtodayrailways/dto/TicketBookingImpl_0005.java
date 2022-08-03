package com.cdac.springtodayrailways.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.springtodayrailways.entity.TicketBooking_0005;
import com.cdac.springtodayrailways.repository.TicketBookingRepository_0005;

@Service
public class TicketBookingImpl_0005 implements TicketBookingDTO_0005 {

	@Autowired
	TicketBookingRepository_0005 objTicketBookingRepository;
	
	@Override
	public List<TicketBooking_0005> getAllBookings() {
		// TODO Auto-generated method stub
		return objTicketBookingRepository.findAll();
	}

	@Override
	public TicketBooking_0005 getBooking(int ticketId) {
		// TODO Auto-generated method stub
		return objTicketBookingRepository.findById(ticketId).get();
	}

	@Override
	public TicketBooking_0005 addBooking(TicketBooking_0005 ticketBooking) {
		// TODO Auto-generated method stub
		return objTicketBookingRepository.save(ticketBooking);
	}

}
