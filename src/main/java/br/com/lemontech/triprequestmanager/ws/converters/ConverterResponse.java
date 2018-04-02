package br.com.lemontech.triprequestmanager.ws.converters;

import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;

public interface ConverterResponse {

	public SolicitacaoViagem converter(Solicitacao solicitacao);
}
