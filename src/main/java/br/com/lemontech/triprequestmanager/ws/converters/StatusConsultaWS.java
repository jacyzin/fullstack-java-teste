package br.com.lemontech.triprequestmanager.ws.converters;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;

/**
 * @author Henry Jacyzin
 * Trata o status da chamada ao webservice
 */
public class StatusConsultaWS {

	public String validaStatusConsulta(Solicitacao solicitacao) {

		if (solicitacao == null) {
			return "FALHA_SOLICITACAO";
		} else if (solicitacao.getAereos().getAereo() == null || solicitacao.getAereos().getAereo().isEmpty()) {
			return "FALHA_AEREO";
		} else
			return "SUCESSO";
	}
}
