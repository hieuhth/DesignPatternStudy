package structuraldp.sdp07_proxy;

public class UserServiceImpl implements UserService {

	private String name;
	 
    public UserServiceImpl(String name) {
        this.name = name;
    }
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println(name + " loaded");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(name + " inserted");
	}

}
