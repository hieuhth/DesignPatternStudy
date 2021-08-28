package behaviordp.bdp05_mediator;

public class UserImpl extends User {

	public UserImpl(String name, ChatMediator med) {
		super(name, med);
		// TODO Auto-generated constructor stub
	}

	@Override
	void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("---");
        System.out.println(this.name + " is sending the message: " + msg);
        mediator.sendMessage(msg, this);
	}

	@Override
	void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " received the message: " + msg);
	}

}
