package structuraldp.sdp02_bridge;

public class VietcomBank extends Bank {

	public VietcomBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.print("Open your account at VietcomBank is a ");
        account.openAccount();
	}

}
