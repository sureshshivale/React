package cab.dto;

public class DashBoardBean 
{
	private String cabNum;
	private int cabCapacity;
	private String cabRoute;
	private String cabTime;
	private int seatCount;
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public String getCabNum() {
		return cabNum;
	}
	public void setCabNum(String cabNum) {
		this.cabNum = cabNum;
	}
	public int getCabCapacity() {
		return cabCapacity;
	}
	public void setCabCapacity(int cabCapacity) {
		this.cabCapacity = cabCapacity;
	}
	public String getCabRoute() {
		return cabRoute;
	}
	public void setCabRoute(String cabRoute) {
		this.cabRoute = cabRoute;
	}
	public String getCabTime() {
		return cabTime;
	}
	public void setCabTime(String cabTime) {
		this.cabTime = cabTime;
	}
}
