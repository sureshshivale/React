package cab.dto;

public class CabDailyBookingDto {
	private int dailyBookingId;
	private int dailySlotSnapId;
	private String userId;
	public int getDailyBookingId() {
		return dailyBookingId;
	}
	public void setDailyBookingId(int dailyBookingId) {
		this.dailyBookingId = dailyBookingId;
	}
	public int getDailySlotSnapId() {
		return dailySlotSnapId;
	}
	public void setDailySlotSnapId(int dailySlotSnapId) {
		this.dailySlotSnapId = dailySlotSnapId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
