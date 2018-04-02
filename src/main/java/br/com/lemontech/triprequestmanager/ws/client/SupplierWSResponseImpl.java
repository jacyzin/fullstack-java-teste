package br.com.lemontech.triprequestmanager.ws.client;

import java.util.List;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;

/**
 * @author Henry Jacyzin Classe responsável por implementar os métodos que irão
 *         tratar a resposta da requisição realizada pelo webservice client
 */
public class SupplierWSResponseImpl implements SupplierWSResponse {

	private List<Solicitacao> listaSolicitacao;

	public SupplierWSResponseImpl(PesquisarSolicitacaoResponse response) {
		this.setCallResponse(response);
	}

	private void setCallResponse(PesquisarSolicitacaoResponse response) {
		this.listaSolicitacao = response.getSolicitacao();
	}

	@Override
	public List<Solicitacao> getListaSolicitacao() {
		return this.listaSolicitacao;
	}

}
