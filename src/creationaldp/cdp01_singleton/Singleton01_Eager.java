package creationaldp.cdp01_singleton;

public class Singleton01_Eager {
	//pros: easy setup
	//cons: always initial object but may be not use, easily break by reflection
	
	private static final Singleton01_Eager INSTANCE = new Singleton01_Eager();
	
	private Singleton01_Eager() {
		
	}
	
	public static Singleton01_Eager getInstance() {
		return INSTANCE;
	}
}
