package br.com.lemontech.triprequestmanager.ws.converters;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.triprequestmanager.domain.AereoSeguimentoSolicitacaoViagem;
import br.com.lemontech.triprequestmanager.domain.AereoSolicitacaoViagem;
import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.triprequestmanager.util.DateUtilities;

/**
 * @author Henry Jacyzin 
 * 		   Classe responsável por converter os objetos obtidos da
 *         resposta do webservice client em objetos do tipo domain, para que
 *         possam ser manipulados pelo serviço de mensageria e pelo banco de
 *         dados
 */

public class ConverterResponseSolicitacao extends ConverterResponseValidate implements ConverterResponse {

	private SolicitacaoViagem solicitacaoViagem = new SolicitacaoViagem();

	/**
	 * Método responsável por receber a conversão do objeto principal Solicitacao em SolicitacaoViagem
	 * @param solicitacao variável do tipo Solicitacao
	 */
	@Override
	public SolicitacaoViagem converter(Solicitacao solicitacao) {
		this.solicitacaoViagem = converterSolicitacao(solicitacao);
		List<AereoSolicitacaoViagem> listaAereoSolicitacaoViagem = converterAereos(solicitacao.getAereos().getAereo(),
				this.solicitacaoViagem);
		this.solicitacaoViagem.setAereo(listaAereoSolicitacaoViagem);
		return this.solicitacaoViagem;
	}

	/**
	 * Método privado responsável por converter lista de Aereos em lista de
	 * AeroSolicitacaoViagem
	 * @param aereos
	 *            variável list compondo objetos Aereo
	 * @param solicitacaoViagem
	 *            variável do tipo SolicitacaoViagem
	 */
	private List<AereoSolicitacaoViagem> converterAereos(List<Aereo> aereos, SolicitacaoViagem solicitacaoViagem) {
		List<AereoSolicitacaoViagem> listaAereoSolicitacaoViagem = new ArrayList<>();
		aereos.forEach(a -> {
			AereoSolicitacaoViagem aereoSolicitacaoViagem = converterAereo(a);
			aereoSolicitacaoViagem.setSolicitacaoViagem(solicitacaoViagem);
			AereoSeguimentoSolicitacaoViagem aereoSeguimentoSolicitacaoViagem = converterAereoSeguimento(
					a.getAereoSeguimento().get(0));
			aereoSeguimentoSolicitacaoViagem.setAereo(aereoSolicitacaoViagem);
			aereoSolicitacaoViagem.setAereoSeguimento(aereoSeguimentoSolicitacaoViagem);
			listaAereoSolicitacaoViagem.add(aereoSolicitacaoViagem);
		});

		return listaAereoSolicitacaoViagem;
	}

	/**
	 * Método privado responsável por converter lista de AereoSeguimento em lista de
	 * AereoSeguimentoSolicitacaoMensagem
	 * 
	 * @param aereoSeguimento
	 *            variável do tipo AereoSeguimento
	 */
	private AereoSeguimentoSolicitacaoViagem converterAereoSeguimento(AereoSeguimento aereoSeguimento) {
		return new AereoSeguimentoSolicitacaoViagem(aereoSeguimento.getAereoVoo().get(0).getIdAereoVoo(),
				aereoSeguimento.getOrigem(), aereoSeguimento.getDestino(),
				DateUtilities.getDate(aereoSeguimento.getDataSaida()),
				DateUtilities.getDate(aereoSeguimento.getDataChegada()), aereoSeguimento.getLocalizadorCia(),
				aereoSeguimento.getMilhas(), aereoSeguimento.getPaisOrigem(), aereoSeguimento.getPaisDestino(),
				aereoSeguimento.getCidadeOrigem(), aereoSeguimento.getCidadeDestino(),
				aereoSeguimento.isSeguimentoCancelado());
	}

	/**
	 * Método privado responsável por converter lista de Aereo em lista de
	 * AereoSolicitacaoViagem
	 * 
	 * @param aereo
	 *            variável do tipo Aereo
	 */
	private AereoSolicitacaoViagem converterAereo(Aereo aereo) {
		return new AereoSolicitacaoViagem(aereo.getId(), aereo.getLocalizador(), aereo.isLocalizadorGds(),
				aereo.getSource(), aereo.getNomeReservador(), DateUtilities.getDate(aereo.getDataVencimento()),
				DateUtilities.getDate(aereo.getDataReserva()), aereo.getMenorTarifa(), aereo.getMaiorTarifa(),
				aereo.getCiaMenorTarifa(), aereo.getCodigoFornecedor());

	}

}
