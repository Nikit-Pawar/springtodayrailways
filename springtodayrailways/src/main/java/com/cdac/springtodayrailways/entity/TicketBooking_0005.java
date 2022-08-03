package com.cdac.springtodayrailways.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tickets_0005")
public class TicketBooking_0005 {

	@Id
	@GeneratedValue(generator="increment")
	@Column(name="ticketid")
	int ticketId;
	
	@Column(name="username")
	String userName;
	
	@Column(name="cityfrom")
	String cityFrom;
	
	@Column(name="cityto")
	String cityTo;
	
	@Column(name="traveldate")
	int travelDate;
	
	public TicketBooking_0005()
	{
		
	}

	public TicketBooking_0005(int ticketId, String userName, String cityFrom, String cityTo, int travelDate) {
		super();
		this.ticketId = ticketId;
		this.userName = userName;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.travelDate = travelDate;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public int getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(int travelDate) {
		this.travelDate = travelDate;
	}
	
}
