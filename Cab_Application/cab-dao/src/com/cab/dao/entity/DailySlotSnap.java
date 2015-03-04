package com.cab.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the daily_slot_snap database table.
 * 
 */
@Entity
@Table(name="daily_slot_snap")
@NamedQuery(name="DailySlotSnap.findAll", query="SELECT d FROM DailySlotSnap d")
public class DailySlotSnap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAILY_SLOT_SNAP_ID")
	private int dailySlotSnapId;

	@Column(name="CAB_NUM")
	private String cabNum;

	@Column(name="CAB_ROUTE_ID")
	private String cabRouteId;

	@Column(name="TIME_SLOT_ID")
	private String timeSlotId;

	public DailySlotSnap() {
	}

	public int getDailySlotSnapId() {
		return this.dailySlotSnapId;
	}

	public void setDailySlotSnapId(int dailySlotSnapId) {
		this.dailySlotSnapId = dailySlotSnapId;
	}

	public String getCabNum() {
		return this.cabNum;
	}

	public void setCabNum(String cabNum) {
		this.cabNum = cabNum;
	}

	public String getCabRouteId() {
		return this.cabRouteId;
	}

	public void setCabRouteId(String cabRouteId) {
		this.cabRouteId = cabRouteId;
	}

	public String getTimeSlotId() {
		return this.timeSlotId;
	}

	public void setTimeSlotId(String timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

}