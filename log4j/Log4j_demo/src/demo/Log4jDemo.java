package demo;

import org.apache.log4j.Logger;

public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger(Log4jDemo.class);
		logger.info("this is info message.");
		logger.info("hello");
	}

}
