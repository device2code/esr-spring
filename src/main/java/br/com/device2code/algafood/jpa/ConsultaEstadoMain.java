package br.com.device2code.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.device2code.algafood.AlgafoodApiApplication;
import br.com.device2code.algafood.domain.model.Estado;
import br.com.device2code.algafood.domain.repository.EstadoRepository;

public class ConsultaEstadoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
		
		List<Estado> todosEstados = estadoRepository.listar();
		
		for (Estado estado: todosEstados) {
			System.out.println(estado.getNome());
		}
	}
	
}