package br.com.lemontech.triprequestmanager.ws.client;

import java.util.List;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;

public interface SupplierWSResponse {

	public List<Solicitacao> getListaSolicitacao();
}
