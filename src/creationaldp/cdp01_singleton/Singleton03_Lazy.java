package creationaldp.cdp01_singleton;

public class Singleton03_Lazy {
	
	//pros: remove limit of Eager and Static block, only init when getInstance
	
	//cons: maybe have more than one instance if run multi-thread
	
	private static Singleton03_Lazy instance;
	
	private Singleton03_Lazy() {
		//Do something to initial
	}
	
	public static Singleton03_Lazy getInstance() {
		if (instance==null)
			instance = new Singleton03_Lazy();
		return instance;
	}
	
}
