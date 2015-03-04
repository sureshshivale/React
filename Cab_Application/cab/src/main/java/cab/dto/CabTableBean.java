package cab.dto;

public class CabTableBean 
{
	private String cabNumber;
	private String cabDriverName;
	private String cabDriverPhone;
	private String cabDirection;
	private String cabRoute;
	private String cabTime;
	public String getCabTime() {
		return cabTime;
	}
	public void setCabTime(String cabTime) {
		this.cabTime = cabTime;
	}
	public String getCabNumber() {
		return cabNumber;
	}
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	public String getCabDriverName() {
		return cabDriverName;
	}
	public void setCabDriverName(String cabDriverName) {
		this.cabDriverName = cabDriverName;
	}
	public String getCabDriverPhone() {
		return cabDriverPhone;
	}
	public void setCabDriverPhone(String cabDriverPhone) {
		this.cabDriverPhone = cabDriverPhone;
	}
	public String getCabDirection() {
		return cabDirection;
	}
	public void setCabDirection(String cabDirection) {
		this.cabDirection = cabDirection;
	}
	public String getCabRoute() {
		return cabRoute;
	}
	public void setCabRoute(String cabRoute) {
		this.cabRoute = cabRoute;
	}
}
