package br.com.lemontech.triprequestmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import br.com.lemontech.triprequestmanager.TriprequestmanagerApplication;
import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.repository.SolicitacaoViagemRepository;
import br.com.lemontech.triprequestmanager.ws.client.ServiceConsumer;
import br.com.lemontech.triprequestmanager.ws.client.ServiceWSClient;

/**
 * @author Henry Jacyzin Implementa os métodos da interface que irão interagir
 *         com o banco de dados e o serviço de mensageria
 */
@Service
public class SolicitacaoViagemServiceImpl implements SolicitacaoViagemService {

	private static final Logger logger = LoggerFactory.getLogger(ServiceWSClient.class);
	private SolicitacaoViagemRepository solicitacaoViagemRepository;
	private ServiceConsumer serviceConsumer;
	private JmsTemplate jmsTemplate;

	@Autowired
	public SolicitacaoViagemServiceImpl(SolicitacaoViagemRepository solicitacaoViagemRepository,
			JmsTemplate jmsTemplate, ServiceConsumer serviceConsumer) {
		this.solicitacaoViagemRepository = solicitacaoViagemRepository;
		this.jmsTemplate = jmsTemplate;
		this.serviceConsumer = serviceConsumer;
	}

	/**
	 * Obtém as solicitações através do webservice, alimenta um objeto list e envia
	 * cada solicitação para o serviço de mensageria
	 *
	 */
	@Override
	public List<SolicitacaoViagem> listAll() {
		List<SolicitacaoViagem> listaSolicitacao = new ArrayList<SolicitacaoViagem>();
		serviceConsumer.getResponse().forEach(s -> {
			listaSolicitacao.add(s);
			sendMessage(s);
		});
		return listaSolicitacao;
	}

	@Override
	public SolicitacaoViagem getById(Integer id) {
		return solicitacaoViagemRepository.findById(id).orElse(null);
	}

	@Override
	public SolicitacaoViagem save(SolicitacaoViagem solicitacaoViagem) {
		solicitacaoViagemRepository.save(solicitacaoViagem);
		return solicitacaoViagem;
	}

	/**
	 * Envia o objeto para a fila de mensagens
	 * 
	 * @param solicitacaoViagem
	 *            variável do tipo SolicitacaoViagem
	 */
	@Override
	public void sendMessage(SolicitacaoViagem solicitacaoViagem) {
		logger.info("Enviando objeto solicitacaoViagem para a fila de mensagens");
		jmsTemplate.convertAndSend(TriprequestmanagerApplication.TRIP_REQUEST_MESSAGE_QUEUE, solicitacaoViagem);

	}

}
