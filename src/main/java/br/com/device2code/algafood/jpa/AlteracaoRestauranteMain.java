package br.com.device2code.algafood.jpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.device2code.algafood.AlgafoodApiApplication;
import br.com.device2code.algafood.domain.model.Restaurante;
import br.com.device2code.algafood.domain.repository.RestauranteRepository;

public class AlteracaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = new Restaurante();
		restaurante.setId(1L);
		restaurante.setNome("Tai 111");
		restaurante.setTaxaFrete(new BigDecimal(1.9));
		
		restaurante = restauranteRepository.salvar(restaurante);
		
		System.out.println(restaurante.getId() + " " + restaurante.getNome() + " " + restaurante.getTaxaFrete());
	}
	
}