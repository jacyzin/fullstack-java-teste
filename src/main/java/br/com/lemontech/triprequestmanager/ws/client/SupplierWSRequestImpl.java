package br.com.lemontech.triprequestmanager.ws.client;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.triprequestmanager.util.DateUtilities;

/**
 * @author Henry Jacyzin Esta classe monta o objeto de request com os parâmetros
 *         de pesquisa para serem executados no servidor webservice
 */
@Service
public class SupplierWSRequestImpl implements SupplierWSRequest {
	
	private static final Integer MESES_RETROATIVOS = -3;
	private static final Integer REGISTRO_INICIAL = 1;
	private static final Integer QUANTIDADE_REGISTROS = 20;
	private static final Boolean EXIBIR_REMARKS = Boolean.TRUE;
	private static final Boolean EXIBIR_APROVADAS = Boolean.TRUE;

	@Override
	public PesquisarSolicitacaoRequest getPesquisarSolicitacaoRequest() {
		PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.MONTH, MESES_RETROATIVOS);
		request.setDataInicial(DateUtilities.getXMLGCConverter(calendar.getTimeInMillis()));
		request.setDataFinal(DateUtilities.getXMLGCConverter(today.getTime()));
		request.setRegistroInicial(REGISTRO_INICIAL);
		request.setQuantidadeRegistros(QUANTIDADE_REGISTROS);
		request.setExibirRemarks(EXIBIR_REMARKS);
		request.setExibirAprovadas(EXIBIR_APROVADAS);
		return request;
	}

}
