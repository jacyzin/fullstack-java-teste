package br.com.lemontech.triprequestmanager.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;

/**
 * @author Henry Jacyzin Classe responsável por executar o request no servidor
 *         webservice
 */
@Service
public class ServiceWSClient extends WebServiceGatewaySupport {

	private static final String KEY_CLIENT = "base_teste_qa";
	private static final String USER_NAME = "d0804903bf4eeefddf55c63fc600ed5c";
	private static final String USER_PASSWORD = "5c11ca0bf738c2dbb460479530b26db0";

	@Autowired
	private WsSelfBookingService service;

	@Autowired
	private SupplierWSRequest supplierWSRequest;

	public PesquisarSolicitacaoResponse getSolicitacao() {

		PesquisarSolicitacaoRequest request = supplierWSRequest.getPesquisarSolicitacaoRequest();
		WsSelfBooking wsSelfBooking = service.getWsSelfBookingPort();
		PesquisarSolicitacaoResponse response = wsSelfBooking.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, USER_PASSWORD,
				request);
		return response;
	}

}
