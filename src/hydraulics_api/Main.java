package hydraulics_api;

import org.apache.log4j.Logger;

public class Main {
	
	final static Logger logger = Logger.getLogger(Main.class);
	

	public static void main(String[] args) throws Exception {

		logger.info("hydraulicsService api parsing start..");
		
		GetArea.getArea();
		
		GetRiver.getRiver();
		
		logger.info("hydraulicsyService api parsing complete!!");

	}

}
