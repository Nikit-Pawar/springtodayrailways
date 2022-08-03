package com.cdac.springtodayrailways.dto;

import java.util.List;

import com.cdac.springtodayrailways.entity.TicketBooking_0005;

public interface TicketBookingDTO_0005 {
	public List<TicketBooking_0005> getAllBookings();
	public TicketBooking_0005 getBooking(int ticketId);
	public TicketBooking_0005 addBooking(TicketBooking_0005 ticketBooking);

}
