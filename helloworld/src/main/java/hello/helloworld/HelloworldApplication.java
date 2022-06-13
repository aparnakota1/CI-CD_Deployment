package hello.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static Logger Log = LoggerFactory.getLogger(HelloworldApplication.class);
	
	public void init() {
		Log.info("Spring Boot Application Started.......");
	}
	
	public static void main(String[] args) {
		Log.info("Application Executed.......");
		
		SpringApplication.run(HelloworldApplication.class, args);
	}
}