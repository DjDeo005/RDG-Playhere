package com.playhere.beans;

import java.sql.Date;
import java.sql.Time;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class TeamFinder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String location;
	private String sports;
	private String reqplayer;
	private String availplayer;
	private Date eventdate;
	private Time eventtime;
	private String contactperson;
	private String contactnum;
	
	
	public TeamFinder() {
		super();
	}


	public TeamFinder(long id, String location, String sports, String reqplayer, String availplayer, Date eventdate,
			Time eventtime, String contactperson, String contactnum) {
		super();
		this.id = id;
		this.location = location;
		this.sports = sports;
		this.reqplayer = reqplayer;
		this.availplayer = availplayer;
		this.eventdate = eventdate;
		this.eventtime = eventtime;
		this.contactperson = contactperson;
		this.contactnum = contactnum;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSports() {
		return sports;
	}


	public void setSports(String sports) {
		this.sports = sports;
	}


	public String getReqplayer() {
		return reqplayer;
	}


	public void setReqplayer(String reqplayer) {
		this.reqplayer = reqplayer;
	}


	public String getAvailplayer() {
		return availplayer;
	}


	public void setAvailplayer(String availplayer) {
		this.availplayer = availplayer;
	}


	public Date getEventdate() {
		return eventdate;
	}


	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}


	public Time getEventtime() {
		return eventtime;
	}


	public void setEventtime(Time eventtime) {
		this.eventtime = eventtime;
	}


	public String getContactperson() {
		return contactperson;
	}


	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}


	public String getContactnum() {
		return contactnum;
	}


	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}


	@Override
	public String toString() {
		return "TeamFinder [id=" + id + ", location=" + location + ", sports=" + sports + ", reqplayer=" + reqplayer
				+ ", availplayer=" + availplayer + ", eventdate=" + eventdate + ", eventtime=" + eventtime
				+ ", contactperson=" + contactperson + ", contactnum=" + contactnum + "]";
	}
	
	
	
	
}
