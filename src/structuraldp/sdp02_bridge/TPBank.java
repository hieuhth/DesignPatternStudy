package structuraldp.sdp02_bridge;

public class TPBank extends Bank {

	public TPBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.print("Open your account at TPBank is a ");
        account.openAccount();
	}

}
