package behaviordp.bdp05_mediator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator mediator = new ChatMediatorImpl("Java design pattern");
        
        User admin = new UserImpl("GP Coder", mediator);
        User user1 = new UserImpl("User 1", mediator);
        User user2 = new UserImpl("User 2", mediator);
        User user3 = new UserImpl("User 3", mediator);
         
        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
 
        admin.send("Hi All");
        user1.send("Hi Admin");
	}

}
