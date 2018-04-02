package br.com.lemontech.triprequestmanager.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity(name = "solicitacao_viagem")
public class SolicitacaoViagem implements Serializable {

	private static final long serialVersionUID = 1L;

	public SolicitacaoViagem() {
	}

	public SolicitacaoViagem(Integer id, String resultadoConsulta) {
		this.id = id;
		this.resultadoConsulta = resultadoConsulta;
	}

	@Id
	@NotNull
	@Column(name = "id_solicitacao_viagem")
	private Integer id;

	@NotNull
	@OneToMany(mappedBy = "solicitacaoViagem", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	List<PassageiroSolicitacaoViagem> passageiroSolicitacaoViagem;

	@NotNull
	@OneToMany(mappedBy = "solicitacaoViagem", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	List<AereoSolicitacaoViagem> aereo;

	@Transient
	private String cidadeDestino;

	@Column(name = "resultado_consulta_ws", length = 15)
	private String resultadoConsulta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<PassageiroSolicitacaoViagem> getPassageiroSolicitacaoViagem() {
		return passageiroSolicitacaoViagem;
	}

	public void setPassageiroSolicitacaoViagem(List<PassageiroSolicitacaoViagem> passageiroSolicitacaoViagem) {
		this.passageiroSolicitacaoViagem = passageiroSolicitacaoViagem;
	}

	public String getResultadoConsulta() {
		return resultadoConsulta;
	}

	public void setResultadoConsulta(String resultadoConsulta) {
		this.resultadoConsulta = resultadoConsulta;
	}

	public List<AereoSolicitacaoViagem> getAereo() {
		return aereo;
	}

	public void setAereo(List<AereoSolicitacaoViagem> aereo) {
		this.aereo = aereo;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

}
