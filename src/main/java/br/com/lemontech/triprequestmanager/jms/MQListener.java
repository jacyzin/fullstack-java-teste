package br.com.lemontech.triprequestmanager.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.lemontech.triprequestmanager.TriprequestmanagerApplication;
import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.repository.SolicitacaoViagemRepository;
import br.com.lemontech.triprequestmanager.ws.client.ServiceWSClient;

/**
 * @author Henry Jacyzin 
 * Classe que é responsável por criar o objeto listener que irá escutar a fila de mensagens \
 * gerada pela aplicação
 */
@Component
public class MQListener {

	private SolicitacaoViagemRepository solicitacaoViagemRepository;

	private static final Logger logger = LoggerFactory.getLogger(ServiceWSClient.class);

	public MQListener(SolicitacaoViagemRepository solicitacaoViagemRepository) {
		this.solicitacaoViagemRepository = solicitacaoViagemRepository;
	}

	/**
	 * Este método fica escutando a fila e quando ocorre qualquer alteração o objeto
	 * da fila é inserido ou atualizado no banco de dados, em seguida removido da
	 * fila
	 * @param solicitacaoViagem variável do tipo SolicitacaoViagem
	 */
	@JmsListener(destination = TriprequestmanagerApplication.TRIP_REQUEST_MESSAGE_QUEUE, containerFactory = "jmsFactory")
	public void receiveMessage(SolicitacaoViagem solicitacaoViagem) {
		solicitacaoViagemRepository.save(solicitacaoViagem);
		logger.info("Mensagem processada da fila");

	}
}
