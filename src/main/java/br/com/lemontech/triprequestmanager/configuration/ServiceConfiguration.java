package br.com.lemontech.triprequestmanager.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.WsSelfBookingService;

/**
 * @author Henry Jacyzin
 * Configura o serviço webservice client
 *
 */
@Configuration
public class ServiceConfiguration {

	@Bean
	public WsSelfBookingService wsSelfBookingService() {
		WsSelfBookingService wsSelfBookingService = new WsSelfBookingService();
		return wsSelfBookingService;
	}

}
