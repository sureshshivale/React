package com.cab.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the daily_booking database table.
 * 
 */
@Entity
@Table(name="daily_booking")
@NamedQuery(name="DailyBooking.findAll", query="SELECT d FROM DailyBooking d")
public class DailyBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAILY_BOOKING_ID")
	private int dailyBookingId;

	@Column(name="DAILY_SLOT_SNAP_ID")
	private int dailySlotSnapId;

	@Column(name="USER_ID")
	private String userId;

	public DailyBooking() {
	}

	public int getDailyBookingId() {
		return this.dailyBookingId;
	}

	public void setDailyBookingId(int dailyBookingId) {
		this.dailyBookingId = dailyBookingId;
	}

	public int getDailySlotSnapId() {
		return this.dailySlotSnapId;
	}

	public void setDailySlotSnapId(int dailySlotSnapId) {
		this.dailySlotSnapId = dailySlotSnapId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}