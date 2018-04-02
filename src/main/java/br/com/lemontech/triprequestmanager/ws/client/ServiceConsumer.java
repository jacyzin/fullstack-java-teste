package br.com.lemontech.triprequestmanager.ws.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lemontech.triprequestmanager.domain.PassageiroSolicitacaoViagem;
import br.com.lemontech.triprequestmanager.domain.SolicitacaoViagem;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.triprequestmanager.util.DateUtilities;
import br.com.lemontech.triprequestmanager.ws.converters.ConverterResponse;
import br.com.lemontech.triprequestmanager.ws.converters.ConverterResponseSolicitacao;

/**
 * @author Henry Jacyzin 
 * Classe responsável por intercambinar os objetos que
 *         serão enviados e recebidos pelo webservice client
 */
@Service
public class ServiceConsumer {

	@Autowired
	ServiceWSClient serviceWSClient;

	private SupplierWSResponse supplierWSResponse;

	/**
	 * Este método recebe o resultado do webservice client e monta um objeto lista
	 * com as solicitações obtidas do servidor webservice
	 */
	public List<SolicitacaoViagem> getResponse() {
		PesquisarSolicitacaoResponse response = serviceWSClient.getSolicitacao();
		supplierWSResponse = new SupplierWSResponseImpl(response);
		return montaListaSolicitacaoViagem(supplierWSResponse.getListaSolicitacao());
	}

	/**
	 * Este método privado executa de fato a montagem de uma lista de objetos,
	 * convertendo os atributos para a lista de objetos SolicitacaoViagem
	 * 
	 * @param listaSolicitacao
	 *            variável do tipo lista compondo objeto Solicitacao
	 */
	private List<SolicitacaoViagem> montaListaSolicitacaoViagem(List<Solicitacao> listaSolicitacao) {

		List<SolicitacaoViagem> listaSolicitacaoViagem = new ArrayList<>();

		listaSolicitacao.forEach(s -> {
			ConverterResponse converterResponse = new ConverterResponseSolicitacao();
			SolicitacaoViagem solicitacaoViagem = converterResponse.converter(s);
			solicitacaoViagem
					.setPassageiroSolicitacaoViagem(montaListaPassageiro(solicitacaoViagem, s.getPassageiros()));
			listaSolicitacaoViagem.add(solicitacaoViagem);
		});

		return listaSolicitacaoViagem;

	}

	/**
	 * Este método privado é responsável por montar uma lista de objetos do tipo
	 * PassageiroSolicitacaoViagem, semelhante ao método acima
	 * @param solicitacaoViagem variável do tipo SolicitacaoViagem
	 * @param passageiros variável do tipo Passageiros
	 */
	private List<PassageiroSolicitacaoViagem> montaListaPassageiro(SolicitacaoViagem solicitacaoViagem,
			Passageiros passageiros) {
		List<PassageiroSolicitacaoViagem> listaPassageiros = new ArrayList<>();
		if (passageiros.getPassageiro() != null && passageiros.getPassageiro().size() > 0) {
			passageiros.getPassageiro().forEach(p -> {
				PassageiroSolicitacaoViagem passageiro = new PassageiroSolicitacaoViagem();
				passageiro.setIdPassageiro(p.getIdPassageiro());
				passageiro.setNome(p.getNome());
				passageiro.setSobrenome(p.getSobrenome());
				passageiro.setMatricula(p.getMatricula());
				passageiro.setDepartamento(p.getDepartamento());
				passageiro.setValorDocumento(p.getValorDocumento());
				passageiro.setDataNascimento(DateUtilities.getDate(p.getDataNascimento()));
				passageiro.setSexo(p.getSexo().name());
				passageiro.setEmpresa(p.getEmpresa());
				passageiro.setTelefone(p.getTelefone());
				passageiro.setDddTel(p.getDddTel());
				passageiro.setCelular(p.getCelular());
				passageiro.setDddCel(p.getDddCel());
				passageiro.setTerceiro(p.isTerceiro());
				passageiro.setAcompanhante(p.isAcompanhante());
				passageiro.setCpf(p.getCpf());
				passageiro.setNomeCompleto(p.getNomeCompleto());
				passageiro.setVip(p.isVip());
				passageiro.setCargo(p.getCargo());
				passageiro.setSolicitacaoViagem(solicitacaoViagem);
				listaPassageiros.add(passageiro);
			});
		}

		return listaPassageiros;
	}

}
