package behaviordp.bdp08_state;

public class StatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentContext context = new DocumentContext();
		 
        context.setState(new NewState());
        context.applyState();
 
        context.setState(new SubmittedState());
        context.applyState();
 
        context.setState(new ApprovedState());
        context.applyState();
	}

}
