package br.eti.clairton.exemplo.controller;

import static br.eti.clairton.inflector.Inflector.getForLocale;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import br.com.caelum.vraptor.util.test.MockSerializationResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.eti.clairton.inflector.Inflector;
import br.eti.clairton.repository.Repository;
import br.eti.clairton.repository.vraptor.QueryParser;

public class PessoaControllerTest {
    private MockSerializationResult result;
    private MockHttpServletRequest request;
    private MockValidator validator;
    private PessoaController controller;
    private Repository repository;
    private Inflector inflector = getForLocale("pt-BR");
    private QueryParser queryParser;
	
	
	@Test
	public void testIndex() {
		controller = new PessoaController(repository, result, inflector, request, queryParser);
	}

}