package Utility;

import org.apache.log4j.Logger;
public class Log {
   static	Logger log = Logger.getLogger("devpinoyLogger");
	public static void loginfo(String msg) 
	{			
        log.info(msg);
	}

}
