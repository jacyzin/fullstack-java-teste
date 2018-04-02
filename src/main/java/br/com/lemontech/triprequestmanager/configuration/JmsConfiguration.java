package br.com.lemontech.triprequestmanager.configuration;

import java.util.Arrays;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Henry Jacyzin
 * Classe de serviço que configura a fila no serviço de mensageria
 */
@Service
public class JmsConfiguration {

	String BROKER_URL = "tcp://localhost:61616";
	String BROKER_USERNAME = "admin";
	String BROKER_PASSWORD = "admin";


	/**
	 * Cria o objeto de conexão com o serviço de fila 
	 */
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(BROKER_URL);
		connectionFactory.setPassword(BROKER_USERNAME);
		connectionFactory.setUserName(BROKER_PASSWORD);
		connectionFactory.setTrustedPackages(Arrays.asList("java.lang",
				"java.util",
				"br.com.lemontech.triprequestmanager"));
		return connectionFactory;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		return template;
	}


	/**
	 * Cria o container para o objeto listener
	 * @param connectionFactory variável do tipo ConnectionFactory
	 */
	@Bean
	public JmsListenerContainerFactory<?> jmsFactory(ConnectionFactory connectionFactory,
			DefaultJmsListenerContainerFactoryConfigurer configurer) {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		configurer.configure(factory, connectionFactory);
		return factory;
	}
}
