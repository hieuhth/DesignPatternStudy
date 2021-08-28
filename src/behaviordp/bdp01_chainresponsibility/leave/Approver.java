package behaviordp.bdp01_chainresponsibility.leave;

public abstract class Approver {
	
	protected Approver nextApprover;
	
	protected void setNext(Approver approver) {
		this.nextApprover = approver;
	}
	
	public void approveLeave(LeaveRequest request) {
		if(canApprove(request.getDays())) {
			this.doApproving(request);
		} else if (nextApprover != null) {
			nextApprover.approveLeave(request);
		}
	}
	
	abstract boolean canApprove(int noDay);
	
	abstract void doApproving(LeaveRequest request);
}
