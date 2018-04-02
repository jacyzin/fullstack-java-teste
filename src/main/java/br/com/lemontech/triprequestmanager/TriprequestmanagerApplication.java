package br.com.lemontech.triprequestmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class TriprequestmanagerApplication {
	
	public final static String TRIP_REQUEST_MESSAGE_QUEUE = "trip-request-message-queue";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	        ConfigurableApplicationContext contexto =
	          SpringApplication.run(TriprequestmanagerApplication.class, args);
	    }

}
