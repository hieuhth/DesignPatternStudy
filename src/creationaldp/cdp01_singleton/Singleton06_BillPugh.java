package creationaldp.cdp01_singleton;

public class Singleton06_BillPugh {
		 
	//Recommend. Good performance for multithread
	//But can break by reflection
    private Singleton06_BillPugh() {
    	
    }
 
    public static Singleton06_BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
 
    private static class SingletonHelper {
        private static final Singleton06_BillPugh INSTANCE = new Singleton06_BillPugh();
    }
}
