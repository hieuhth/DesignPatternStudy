package structuraldp.sdp07_proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");
         
        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();
         
        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
        
        
        
        System.out.println("------Protection Proxy------");
        UserService admin = new UserServiceProxy("gpcoder", "admin");
        admin.load();
        admin.insert();
 
        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
	}

}
