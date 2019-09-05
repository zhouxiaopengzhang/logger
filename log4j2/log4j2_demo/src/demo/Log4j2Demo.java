package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=LogManager.getLogger(Log4j2Demo.class);
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
	}

}
