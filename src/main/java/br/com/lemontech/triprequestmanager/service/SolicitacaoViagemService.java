package br.com.lemontech.triprequestmanager.service;

import java.util.List;

import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;

/**
 * @author Henry Jacyzin Interface criada para gerenciar os métodos que irão
 *         interagir com a fila de mensagens e persistir os dados no banco de
 *         dados
 */
public interface SolicitacaoViagemService {

	List<SolicitacaoViagem> listAll();

	SolicitacaoViagem getById(Integer id);

	SolicitacaoViagem save(SolicitacaoViagem solicitacaoViagem);

	void sendMessage(SolicitacaoViagem solicitacaoViagem);
}
