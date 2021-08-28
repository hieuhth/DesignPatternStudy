package structuraldp.sdp05_facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFacade.getInstance().buyProductByCashWithFreeShipping("contact@gpcoder.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("gpcodervn@gmail.com", "0988.999.999");
	}

}
