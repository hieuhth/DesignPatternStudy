package behaviordp.bdp01_chainresponsibility.logger;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = AppLogger.getLogger();
		// Handled by ConsoleLogger since the console has a LogLevel of DEBUG
		logger.log(LogLevel.INFO, "Info Message");
		logger.log(LogLevel.DEBUG, "Debug message");
		
		// Handled by ConsoleLogger and FileLogger
		logger.log(LogLevel.ERROR, "Error message");
		
		// Handled by ConsoleLogger, FileLogger, EmailLogger
		logger.log(LogLevel.FATAL, "Fatal message");
	}

}
