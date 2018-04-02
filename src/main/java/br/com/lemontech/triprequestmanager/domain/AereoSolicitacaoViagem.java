package br.com.lemontech.triprequestmanager.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "aereo")
public class AereoSolicitacaoViagem implements Serializable {

	private static final long serialVersionUID = 1L;

	public AereoSolicitacaoViagem() {
	}

	public AereoSolicitacaoViagem(@NotNull Integer idAereo, String localizador, Boolean localizadorGds, String source,
			String nomeReservador, Date dataVencimento, Date dataReserva, Double menorTarifa, Double maiorTarifa,
			String ciaMenorTarifa, String codigoFornecedor) {
		super();
		this.idAereo = idAereo;
		this.localizador = localizador;
		this.localizadorGds = localizadorGds;
		this.source = source;
		this.nomeReservador = nomeReservador;
		this.dataVencimento = dataVencimento;
		this.dataReserva = dataReserva;
		this.menorTarifa = menorTarifa;
		this.maiorTarifa = maiorTarifa;
		this.ciaMenorTarifa = ciaMenorTarifa;
		this.codigoFornecedor = codigoFornecedor;
	}

	@Id
	@NotNull
	@Column(name = "id_aereo")
	private Integer idAereo;
	
	@NotNull
	@JoinColumn(name = "solicitacao_viagem_id")
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private SolicitacaoViagem solicitacaoViagem;

	@NotNull
	@OneToOne(mappedBy = "aereo", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	AereoSeguimentoSolicitacaoViagem aereoSeguimento;

	@Column(name = "localizador", length = 15)
	private String localizador;

	@Column(name = "localizador_gds")
	private Boolean localizadorGds;

	@Column(name = "source", length = 15)
	private String source;

	@Column(name = "nome_reservador", length = 100)
	private String nomeReservador;

	@Column(name = "data_vencimento")
	private Date dataVencimento;

	@Column(name = "data_reserva")
	private Date dataReserva;

	@Column(name = "menor_tarifa")
	private Double menorTarifa;

	@Column(name = "maior_tarifa")
	private Double maiorTarifa;

	@Column(name = "cia_menor_tarifa", length = 100)
	private String ciaMenorTarifa;

	@Column(name = "codigo_fornecedor", length = 15)
	private String codigoFornecedor;

	public Integer getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(Integer idAereo) {
		this.idAereo = idAereo;
	}

	public String getLocalizador() {
		return localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}

	public Boolean getLocalizadorGds() {
		return localizadorGds;
	}

	public void setLocalizadorGds(Boolean localizadorGds) {
		this.localizadorGds = localizadorGds;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getNomeReservador() {
		return nomeReservador;
	}

	public void setNomeReservador(String nomeReservador) {
		this.nomeReservador = nomeReservador;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Double getMenorTarifa() {
		return menorTarifa;
	}

	public void setMenorTarifa(Double menorTarifa) {
		this.menorTarifa = menorTarifa;
	}

	public Double getMaiorTarifa() {
		return maiorTarifa;
	}

	public void setMaiorTarifa(Double maiorTarifa) {
		this.maiorTarifa = maiorTarifa;
	}

	public String getCiaMenorTarifa() {
		return ciaMenorTarifa;
	}

	public void setCiaMenorTarifa(String ciaMenorTarifa) {
		this.ciaMenorTarifa = ciaMenorTarifa;
	}

	public String getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public SolicitacaoViagem getSolicitacaoViagem() {
		return solicitacaoViagem;
	}

	public void setSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {
		this.solicitacaoViagem = solicitacaoViagem;
	}

	public AereoSeguimentoSolicitacaoViagem getAereoSeguimento() {
		return aereoSeguimento;
	}

	public void setAereoSeguimento(AereoSeguimentoSolicitacaoViagem aereoSeguimento) {
		this.aereoSeguimento = aereoSeguimento;
	}

}
