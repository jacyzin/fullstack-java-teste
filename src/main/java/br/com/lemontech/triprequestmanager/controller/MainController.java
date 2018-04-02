package br.com.lemontech.triprequestmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lemontech.triprequestmanager.service.SolicitacaoViagemService;

@Controller
public class MainController {

	private SolicitacaoViagemService solicitacaoViagemService;
	
	@Autowired
	public void setSolicitacaoViagemService(SolicitacaoViagemService solicitacaoViagemService) {
		this.solicitacaoViagemService = solicitacaoViagemService;
	}

	@RequestMapping(value = { "/main" }, method = RequestMethod.GET)
	public String main(Model model) {
		model.addAttribute("solicitacoes", solicitacaoViagemService.listAll());
		return "main";
	}

}
