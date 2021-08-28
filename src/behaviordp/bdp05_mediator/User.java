package behaviordp.bdp05_mediator;

public abstract class User {
	
	protected String name;
	protected ChatMediator mediator;
	
	public User(String name, ChatMediator med) {
		this.name = name;
		this.mediator = med;
	}
	
	abstract void send(String msg);
	abstract void receive(String msg);
	
	@Override
    public int hashCode() {
        return name.hashCode();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
 
        }
 
        if (this.getClass() != obj.getClass()) {
            return false;
        }
 
        User user = (User) obj;
        return name.equals(user.name);
    }
	
}
