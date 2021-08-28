package creationaldp.cdp01_singleton;

public class Singleton04_ThreadSafe {
	//using synchronized keyword
	//volatile: notify to other thread about change of value of variable 
	
	//cons: run slow, more resource
	
	private static volatile Singleton04_ThreadSafe instance;
	
	private Singleton04_ThreadSafe() {
		//Do something to initial
	}
	
	public synchronized static Singleton04_ThreadSafe getInstance() {
		if (instance==null)
			instance = new Singleton04_ThreadSafe();
		return instance;
	}
}
