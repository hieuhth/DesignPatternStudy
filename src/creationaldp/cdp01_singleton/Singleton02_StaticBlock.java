package creationaldp.cdp01_singleton;

public class Singleton02_StaticBlock {

	//same as Eager but additional static block for handle exception  
	
	private static final Singleton02_StaticBlock INSTANCE;
	
	private Singleton02_StaticBlock() {
		// TODO Auto-generated constructor stub
		
	}
	
	static {
        try {
            INSTANCE = new Singleton02_StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
	
	public static Singleton02_StaticBlock getInstance() {
		return INSTANCE;
	}
}
