package slf4j.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 该类作用：
 * 		通过slf4j日志框架适配log4j日志系统
 * 		因此需要的jar分为三部分：slf4j日志框架的jar、适配器的jar、log4j日志系统的jar
 * 						  slf4j-api.jar 、 slf4j-log4j.jar  、log4j.jar    
 */
public class Demo {
	 private static final Logger logger = LoggerFactory.getLogger(Demo.class);
	 public static void main(String[] args) {
	        logger.info("Current Time: {}", System.currentTimeMillis());
	        logger.info("Current Time: " + System.currentTimeMillis());
	        logger.info("Current Time: {}", System.currentTimeMillis());
	        logger.trace("trace log");
	        logger.warn("warn log");
	        logger.debug("debug log");
	        logger.info("info log");
	        logger.error("error log");
	    }
	
}
