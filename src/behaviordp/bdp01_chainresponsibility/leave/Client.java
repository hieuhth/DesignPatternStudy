package behaviordp.bdp01_chainresponsibility.leave;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveRequestFlow.getApprover().approveLeave(new LeaveRequest("User 1", 2));
        System.out.println("---");
        LeaveRequestFlow.getApprover().approveLeave(new LeaveRequest("User 2",5));
        System.out.println("---");
        LeaveRequestFlow.getApprover().approveLeave(new LeaveRequest("User 2",7));
	}

}
