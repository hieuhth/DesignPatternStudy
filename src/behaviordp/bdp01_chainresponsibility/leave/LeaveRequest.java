package behaviordp.bdp01_chainresponsibility.leave;

public class LeaveRequest {
	private String nameStaff;
	private int noDay;
	
	public LeaveRequest(String name, int days) {
		this.nameStaff = name;
		this.noDay = days;
	}
	
	public int getDays() {
		return noDay;
	}
	
	public String getName() {
		return nameStaff;
	}
	
}
