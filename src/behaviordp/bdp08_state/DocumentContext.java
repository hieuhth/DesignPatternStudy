package behaviordp.bdp08_state;

public class DocumentContext {
	private State state;
		
	public void setState(State state) {
		this.state = state;
	}
	
	public void applyState() {
		state.handleRequest();
	}
	
}
