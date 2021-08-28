package behaviordp.bdp01_chainresponsibility.leave;

public class LeaveRequestFlow {
	public static Approver getApprover() {
		Approver supervisor = new Supervisor();
		Approver manager = new DeliveryManager();
		Approver director = new Director();
		
		supervisor.setNext(manager);
		manager.setNext(director);
		
		return supervisor;
	}
}
