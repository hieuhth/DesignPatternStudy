package creationaldp.cdp02_factorymethod;

import creationaldp.cdp02_factorymethod.Contants.BankType;

public class BankFactory {
		
	public static Bank getBank(BankType bankType) {
		
		switch (bankType) {
			case VIETCOMBANK:
				return new VCBank();
			case TPBANK:
				return new TPBank();
			default:
	            throw new IllegalArgumentException("This bank type is unsupported");
		}
		
	}
}
