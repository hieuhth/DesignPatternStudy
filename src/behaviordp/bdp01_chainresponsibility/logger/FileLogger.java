package behaviordp.bdp01_chainresponsibility.logger;

public class FileLogger extends Logger {

	public FileLogger(LogLevel logLevel) {
		super(logLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("File logger: " + msg);
	}
}
