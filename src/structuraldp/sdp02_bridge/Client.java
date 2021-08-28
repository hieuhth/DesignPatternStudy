package structuraldp.sdp02_bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank vietcomBank = new VietcomBank(new CheckingAccount());
		vietcomBank.openAccount();
		
		Bank tpBank = new TPBank(new SavingAccount());
		tpBank.openAccount();
	}

}
