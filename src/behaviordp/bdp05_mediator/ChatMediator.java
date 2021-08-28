package behaviordp.bdp05_mediator;

public interface ChatMediator {
	
	abstract void sendMessage(String msg, User user);
	abstract void addUser(User user);
}
