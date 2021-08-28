package behaviordp.bdp02_command.bank;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("hieuht18");
		 
        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);
 
        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
	}

}
