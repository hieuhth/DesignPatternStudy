package creationaldp.cdp01_singleton;

public class Singleton05_DoubleCheckLocking {
	//Check instance 2 times
	//
	
	private static volatile Singleton05_DoubleCheckLocking instance;
	 
    private Singleton05_DoubleCheckLocking() {
    }
 
    public static Singleton05_DoubleCheckLocking getInstance() {
        // Do something before get instance ...
        if (instance == null) {
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (Singleton05_DoubleCheckLocking.class) {
                // Re-check again. Maybe another thread has initialized before
                if (instance == null) {
                    instance = new Singleton05_DoubleCheckLocking();
                }
            }
        }
        // Do something after get instance ...
        return instance;
    }
}
