package com.capgemini.pe4;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrnellaApp {
		
		
		public static Logger Logger=LoggerFactory.getLogger(OrnellaApp.class);
	
	public static void main(String[] args) {
		/*
		System.out.println("version 1");
		System.out.println("version de Ornella tralala");
		*/
		Logger.info("version 1");
		Logger.debug("version de Ornella tralala");
		//logger.error () dans try/catch
		}

}
