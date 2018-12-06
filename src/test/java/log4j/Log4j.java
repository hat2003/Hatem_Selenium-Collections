package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.Configurations;

public class Log4j {

	// We need to add log4j.xml

	public static Logger log = LogManager.getLogger(Configurations.class.getName());

	@Test
	public void Testcase1() {

		log.debug("");
		log.info("");

	}

}
