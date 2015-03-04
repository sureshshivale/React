package cab.dto;

public class DailySlotSnapDto {
	private int dailySlotSnapId;
	private String timeSlotId;
	private String cabNumber;
	private String cabRouteId;
	public int getDailySlotSnapId() {
		return dailySlotSnapId;
	}
	public void setDailySlotSnapId(int dailySlotSnapId) {
		this.dailySlotSnapId = dailySlotSnapId;
	}
	public String getTimeSlotId() {
		return timeSlotId;
	}
	public void setTimeSlotId(String timeSlotId) {
		this.timeSlotId = timeSlotId;
	}
	public String getCabNumber() {
		return cabNumber;
	}
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	public String getCabRouteId() {
		return cabRouteId;
	}
	public void setCabRouteId(String cabRouteId) {
		this.cabRouteId = cabRouteId;
	}
	

}
