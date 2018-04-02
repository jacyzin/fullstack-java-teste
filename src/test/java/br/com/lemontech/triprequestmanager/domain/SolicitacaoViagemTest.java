package br.com.lemontech.triprequestmanager.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Henry Jacyzin
 * Classe criada para validar persistência dos objetos no banco de dados
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SolicitacaoViagemTest {
	
	@Autowired
    private TestEntityManager entityManager;
    
    @Test
    public void whenFindById_thenReturnSolicitacaoViagem() {
        SolicitacaoViagem solicitacao = new SolicitacaoViagem();
        PassageiroSolicitacaoViagem passageiro = new PassageiroSolicitacaoViagem();
        AereoSolicitacaoViagem aereo = new AereoSolicitacaoViagem();
        AereoSeguimentoSolicitacaoViagem aereoSeguimento = new AereoSeguimentoSolicitacaoViagem();
        
        solicitacao.setId(9999);
        aereo.setIdAereo(99);
        aereo.setSolicitacaoViagem(solicitacao);
        passageiro.setNomeCompleto("Lucas Alberto de Sá");
        passageiro.setSolicitacaoViagem(solicitacao);
        aereoSeguimento.setIdAereoSeguimento(99999);
        aereoSeguimento.setCidadeDestino("RÚSSIA");
        aereoSeguimento.setAereo(aereo);
        aereo.setAereoSeguimento(aereoSeguimento);
        solicitacao.setPassageiroSolicitacaoViagem(Arrays.asList(passageiro));
        solicitacao.setAereo(Arrays.asList(aereo));
        SolicitacaoViagem found = entityManager.persistAndFlush(solicitacao);
             
        assertThat(found.getId())
          .isEqualTo(solicitacao.getId());
    }
    
    @Test
    public void whenFindByName_thenPassageiro() {
   
    	SolicitacaoViagem solicitacao = new SolicitacaoViagem();
        PassageiroSolicitacaoViagem passageiro = new PassageiroSolicitacaoViagem();
        AereoSolicitacaoViagem aereo = new AereoSolicitacaoViagem();
        AereoSeguimentoSolicitacaoViagem aereoSeguimento = new AereoSeguimentoSolicitacaoViagem();
        
        solicitacao.setId(9999);
        aereo.setIdAereo(99);
        aereo.setSolicitacaoViagem(solicitacao);
        passageiro.setIdPassageiro(999);
        passageiro.setNomeCompleto("Lucas Almeida de Sá");
        passageiro.setSolicitacaoViagem(solicitacao);
        aereoSeguimento.setIdAereoSeguimento(99999);
        aereoSeguimento.setCidadeDestino("RÚSSIA");
        aereoSeguimento.setAereo(aereo);
        aereo.setAereoSeguimento(aereoSeguimento);
        solicitacao.setPassageiroSolicitacaoViagem(Arrays.asList(passageiro));
        solicitacao.setAereo(Arrays.asList(aereo));
        PassageiroSolicitacaoViagem found = entityManager.persist(passageiro);
        entityManager.flush();
        
        assertThat(found.getNomeCompleto())
          .isEqualTo(passageiro.getNomeCompleto());
    }
    
    @Test
    public void whenFindByCidadeDestino_thenAereoSeguimento() {
   
    	SolicitacaoViagem solicitacao = new SolicitacaoViagem();
        PassageiroSolicitacaoViagem passageiro = new PassageiroSolicitacaoViagem();
        AereoSolicitacaoViagem aereo = new AereoSolicitacaoViagem();
        AereoSeguimentoSolicitacaoViagem aereoSeguimento = new AereoSeguimentoSolicitacaoViagem();
        
        solicitacao.setId(9999);
        aereo.setIdAereo(99);
        aereo.setCodigoFornecedor("HH");
        aereo.setSolicitacaoViagem(solicitacao);
        passageiro.setIdPassageiro(999);
        passageiro.setNomeCompleto("Lucas Alberto de Sá");
        passageiro.setSolicitacaoViagem(solicitacao);
        aereoSeguimento.setIdAereoSeguimento(99999);
        aereoSeguimento.setCidadeDestino("RÚSSIA");
        aereoSeguimento.setAereo(aereo);
        aereo.setAereoSeguimento(aereoSeguimento);
        solicitacao.setPassageiroSolicitacaoViagem(Arrays.asList(passageiro));
        solicitacao.setAereo(Arrays.asList(aereo));
        AereoSeguimentoSolicitacaoViagem found = entityManager.persistAndFlush(aereoSeguimento);
             
        assertThat(found.getCidadeDestino())
          .isEqualTo(aereoSeguimento.getCidadeDestino());
    }

}
