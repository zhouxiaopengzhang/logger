package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * logback是完整实现上slf4j日志框架的api，因此不需要适配器的jar
 * 需要的jar：slf4j-api.jar 、 logback-core.jar 、 logback-class.jar
 */
public class Demo {
	private final static Logger logger = LoggerFactory.getLogger(Demo.class);
	public static void main(String[] args) {
		logger.info("logback 成功了");
		logger.error("logback 成功了");
		logger.debug("logback 成功了");
	}
}
