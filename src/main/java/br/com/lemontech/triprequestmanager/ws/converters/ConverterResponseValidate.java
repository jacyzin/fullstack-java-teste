package br.com.lemontech.triprequestmanager.ws.converters;

import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;

/**
 * @author Henry Jacyzin 
 * Converte o objeto Solicitacao em SolicitacaoViagem e atribui status do response na chamada ao webservice
 */
public abstract class ConverterResponseValidate {

	private StatusConsultaWS statusConsultaWS = new StatusConsultaWS();

	public SolicitacaoViagem converterSolicitacao(Solicitacao solicitacao) {
		String statusConsultaWS = this.statusConsultaWS.validaStatusConsulta(solicitacao);
		SolicitacaoViagem solicitacaoViagem = new SolicitacaoViagem(solicitacao.getIdSolicitacao(), statusConsultaWS);
		return solicitacaoViagem;
	}

}
