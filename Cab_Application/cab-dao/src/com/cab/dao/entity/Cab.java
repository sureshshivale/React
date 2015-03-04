package com.cab.dao.entity;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.context.annotation.Scope;


/**
 * The persistent class for the cab database table.
 * 
 */
@Entity
@NamedQuery(name="Cab.findAll", query="SELECT c FROM Cab c")
public class Cab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAB_NUM")
	private String cabNum;

	@Column(name="CAB_CAPACITY")
	private int cabCapacity;

	@Column(name="CAB_DRV_NAME")
	private String cabDrvName;

	@Column(name="CAB_DRV_PHONE")
	private String cabDrvPhone;

	@Column(name="CAB_POC")
	private String cabPoc;

	public Cab() {
	}

	public String getCabNum() {
		return this.cabNum;
	}

	public void setCabNum(String cabNum) {
		this.cabNum = cabNum;
	}

	public int getCabCapacity() {
		return this.cabCapacity;
	}

	public void setCabCapacity(int cabCapacity) {
		this.cabCapacity = cabCapacity;
	}

	public String getCabDrvName() {
		return this.cabDrvName;
	}

	public void setCabDrvName(String cabDrvName) {
		this.cabDrvName = cabDrvName;
	}

	public String getCabDrvPhone() {
		return this.cabDrvPhone;
	}

	public void setCabDrvPhone(String cabDrvPhone) {
		this.cabDrvPhone = cabDrvPhone;
	}

	public String getCabPoc() {
		return this.cabPoc;
	}

	public void setCabPoc(String cabPoc) {
		this.cabPoc = cabPoc;
	}

}