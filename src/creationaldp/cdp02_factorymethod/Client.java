package creationaldp.cdp02_factorymethod;

import creationaldp.cdp02_factorymethod.Contants.BankType;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = BankFactory.getBank(BankType.TPBANK);
		System.out.println(bank1.getBankName());
	}
}
