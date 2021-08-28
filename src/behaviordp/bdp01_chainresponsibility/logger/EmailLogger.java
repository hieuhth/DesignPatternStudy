package behaviordp.bdp01_chainresponsibility.logger;

public class EmailLogger extends Logger {

	public EmailLogger(LogLevel logLevel) {
		super(logLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email logger: " + msg);
	}
}
