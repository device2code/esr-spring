package br.com.device2code.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.device2code.algafood.AlgafoodApiApplication;
import br.com.device2code.algafood.domain.model.FormaPagamento;
import br.com.device2code.algafood.domain.repository.FormaPagamentoRepository;

public class ConsultaFormaPagamentoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> todasFormasPagamento = formaPagamentoRepository.listar();
		
		for (FormaPagamento formaPagamento : todasFormasPagamento) {
			System.out.println(formaPagamento.getDescricao());
		}
	}
	
}