package behaviordp.bdp01_chainresponsibility.leave;

public class DeliveryManager extends Approver {

	@Override
	boolean canApprove(int noDay) {
		// TODO Auto-generated method stub
		return (noDay<=5);
	}

	@Override
	void doApproving(LeaveRequest request) {
		// TODO Auto-generated method stub
		System.out.println("Delivery Manager approved for " + request.getName() + " leave on " + request.getDays());
	}

}
