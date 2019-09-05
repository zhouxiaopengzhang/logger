package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*slf4j框架只是一些接口(相当于规范)，具体实现还要依赖以相应的日志系统，比如log4j*/
/*slf4j典型的使用模式*/
//该实例需要两个jar：	 slf4j-api.jar以及slf4j-simple.jar
public class TypicalUsagePattern {
	private Logger log=LoggerFactory.getLogger(TypicalUsagePattern.class);
	Integer t;
	Integer oldT;
	public void setTemperature(Integer temperature){
		oldT=t;
		t=temperature;
		//下面字符串中的大括号相当于占位符
		log.debug("Temperature set to {}. Old temperature was {}.",t,oldT);
		if(temperature.intValue()>50){
			log.info("Temperature has risen above 50 degress.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypicalUsagePattern typical=new TypicalUsagePattern();
		typical.setTemperature(51);
	}

}
