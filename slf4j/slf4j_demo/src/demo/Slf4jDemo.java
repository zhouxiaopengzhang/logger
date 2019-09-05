package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=LoggerFactory.getLogger(Slf4jDemo.class);
		logger.info("hello world");
	}

}
