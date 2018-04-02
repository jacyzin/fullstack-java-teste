package br.com.lemontech.triprequestmanager.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "aereo_seguimento")
public class AereoSeguimentoSolicitacaoViagem implements Serializable {

	private static final long serialVersionUID = 1L;

	public AereoSeguimentoSolicitacaoViagem() {
	}

	public AereoSeguimentoSolicitacaoViagem(Integer idAereoSeguimento, String origem, String destino, Date dataSaida,
			Date dataChegada, String localizadorCia, Double milhas, String paisOrigem, String paisDestino,
			String cidadeOrigem, String cidadeDestino, Boolean seguimentoCancelado) {
		this.idAereoSeguimento = idAereoSeguimento;
		this.origem = origem;
		this.destino = destino;
		this.dataSaida = dataSaida;
		this.dataChegada = dataChegada;
		this.localizadorCia = localizadorCia;
		this.milhas = milhas;
		this.paisOrigem = paisOrigem;
		this.paisDestino = paisDestino;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.seguimentoCancelado = seguimentoCancelado;
	}

	@Id
	@NotNull
	@Column(name = "id_aereo_seguimento")
	private Integer idAereoSeguimento;

	@JoinColumn(name = "aereo_id")
	@NotNull
	@OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private AereoSolicitacaoViagem aereo;

	@Column(name = "origem", length = 10)
	private String origem;

	@Column(name = "destino", length = 10)
	private String destino;

	@Column(name = "data_saida")
	private Date dataSaida;

	@Column(name = "data_chegada")
	private Date dataChegada;

	@Column(name = "localizador_cia", length = 50)
	private String localizadorCia;

	@Column(name = "milhas")
	private Double milhas;

	@Column(name = "pais_origem", length = 2)
	private String paisOrigem;

	@Column(name = "pais_destino", length = 2)
	private String paisDestino;

	@Column(name = "cidade_origem", length = 150)
	private String cidadeOrigem;

	@Column(name = "cidade_destino", length = 150)
	private String cidadeDestino;

	@Column(name = "seguimento_cancelado")
	private Boolean seguimentoCancelado;

	public Integer getIdAereoSeguimento() {
		return idAereoSeguimento;
	}

	public void setIdAereoSeguimento(Integer idAereoSeguimento) {
		this.idAereoSeguimento = idAereoSeguimento;
	}

	public AereoSolicitacaoViagem getAereo() {
		return aereo;
	}

	public void setAereo(AereoSolicitacaoViagem aereo) {
		this.aereo = aereo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getLocalizadorCia() {
		return localizadorCia;
	}

	public void setLocalizadorCia(String localizadorCia) {
		this.localizadorCia = localizadorCia;
	}

	public Double getMilhas() {
		return milhas;
	}

	public void setMilhas(Double milhas) {
		this.milhas = milhas;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public Boolean getSeguimentoCancelado() {
		return seguimentoCancelado;
	}

	public void setSeguimentoCancelado(Boolean seguimentoCancelado) {
		this.seguimentoCancelado = seguimentoCancelado;
	}

}
