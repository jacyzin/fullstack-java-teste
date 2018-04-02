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
import javax.validation.constraints.NotNull;

@Entity(name = "passageiro")
public class PassageiroSolicitacaoViagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name = "id_passageiro")
	private int idPassageiro;

	@NotNull
	@JoinColumn(name = "solicitacao_viagem_id")
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private SolicitacaoViagem solicitacaoViagem;

	@Column(name = "nome", length = 20)
	private String nome;

	@Column(name = "sobrenome", length = 100)
	private String sobrenome;

	@Column(name = "matricula", length = 50)
	private String matricula;

	@Column(name = "departamento", length = 100)
	private String departamento;

	@Column(name = "tipo_registro", length = 50)
	private String tipoPassageiro;

	@Column(name = "tipo_documento", length = 30)
	private String tipoDocumento;

	@Column(name = "valor_documento", length = 50)
	private String valorDocumento;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Column(name = "sexo", length = 10)
	private String sexo;

	@Column(name = "empresa", length = 50)
	private String empresa;

	@Column(name = "telefone", length = 15)
	private String telefone;

	@Column(name = "celular", length = 15)
	private String celular;

	@Column(name = "ddd_telefone", length = 2)
	private String dddTel;

	@Column(name = "ddd_cel", length = 2)
	private String dddCel;

	@Column(name = "terceiro")
	private Boolean terceiro;

	@Column(name = "acompanhante")
	private Boolean acompanhante;

	@Column(name = "cpf", length = 11)
	private String cpf;

	@Column(name = "nome_completo", length = 150)
	private String nomeCompleto;

	@Column(name = "vip")
	private Boolean vip;

	@Column(name = "cargo", length = 50)
	private String cargo;

	public int getIdPassageiro() {
		return idPassageiro;
	}

	public void setIdPassageiro(int idPassageiro) {
		this.idPassageiro = idPassageiro;
	}

	public SolicitacaoViagem getSolicitacaoViagem() {
		return solicitacaoViagem;
	}

	public void setSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {
		this.solicitacaoViagem = solicitacaoViagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTipoPassageiro() {
		return tipoPassageiro;
	}

	public void setTipoPassageiro(String tipoPassageiro) {
		this.tipoPassageiro = tipoPassageiro;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(String valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDddTel() {
		return dddTel;
	}

	public void setDddTel(String dddTel) {
		this.dddTel = dddTel;
	}

	public String getDddCel() {
		return dddCel;
	}

	public void setDddCel(String dddCel) {
		this.dddCel = dddCel;
	}

	public Boolean getTerceiro() {
		return terceiro;
	}

	public void setTerceiro(Boolean terceiro) {
		this.terceiro = terceiro;
	}

	public Boolean getAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(Boolean acompanhante) {
		this.acompanhante = acompanhante;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
