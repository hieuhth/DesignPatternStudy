package behaviordp.bdp01_chainresponsibility.leave;

public class Supervisor extends Approver {

	@Override
	boolean canApprove(int noDay) {
		// TODO Auto-generated method stub
		return (noDay<=3);
	}

	@Override
	void doApproving(LeaveRequest request) {
		// TODO Auto-generated method stub
		System.out.println("Supervisor approved for " + request.getName() + " leave on " + request.getDays());
	}

}
