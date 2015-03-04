package com.cab.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cab_route database table.
 * 
 */
@Entity
@Table(name="cab_route")
@NamedQuery(name="CabRoute.findAll", query="SELECT c FROM CabRoute c")
public class CabRoute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAB_ROUTE_ID")
	private String cabRouteId;

	@Column(name="CAB_DIRECTION")
	private String cabDirection;

	@Column(name="CAB_ROUTE")
	private String cabRoute;

	public CabRoute() {
	}

	public String getCabRouteId() {
		return this.cabRouteId;
	}

	public void setCabRouteId(String cabRouteId) {
		this.cabRouteId = cabRouteId;
	}

	public String getCabDirection() {
		return this.cabDirection;
	}

	public void setCabDirection(String cabDirection) {
		this.cabDirection = cabDirection;
	}

	public String getCabRoute() {
		return this.cabRoute;
	}

	public void setCabRoute(String cabRoute) {
		this.cabRoute = cabRoute;
	}

}