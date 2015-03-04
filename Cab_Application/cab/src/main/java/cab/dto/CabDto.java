package cab.dto;

public class CabDto {
	private String cabNumber;
	private String cabDriverName;
	private String cabDriverPhone;
	private int cabCapacity;
	private String cabCapacitystr;
	public String getCabCapacitystr() {
		return cabCapacitystr;
	}
	public void setCabCapacitystr(String cabCapacitystr) {
		this.cabCapacitystr = cabCapacitystr;
	}
	private String cabPoc;
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
	public int getCabCapacity() {
		return cabCapacity;
	}
	public void setCabCapacity(int cabCapacity) {
		this.cabCapacity = cabCapacity;
	}
	public String getCabPoc() {
		return cabPoc;
	}
	public void setCabPoc(String cabPoc) {
		this.cabPoc = cabPoc;
	}
	
}
