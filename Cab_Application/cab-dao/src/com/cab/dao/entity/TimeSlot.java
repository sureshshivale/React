package com.cab.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the time_slot database table.
 * 
 */
@Entity
@Table(name="time_slot")
@NamedQuery(name="TimeSlot.findAll", query="SELECT t FROM TimeSlot t")
public class TimeSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TIME_SLOT_ID")
	private String timeSlotId;

	@Column(name="TIME_SLOT")
	private Time timeSlot;

	public TimeSlot() {
	}

	public String getTimeSlotId() {
		return this.timeSlotId;
	}

	public void setTimeSlotId(String timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public Time getTimeSlot() {
		return this.timeSlot;
	}

	public void setTimeSlot(Time timeSlot) {
		this.timeSlot = timeSlot;
	}

}