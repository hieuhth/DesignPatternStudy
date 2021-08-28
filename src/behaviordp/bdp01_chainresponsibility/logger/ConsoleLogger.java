package behaviordp.bdp01_chainresponsibility.logger;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(LogLevel logLevel) {
		super(logLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Console logger: " + msg);
	}
}
