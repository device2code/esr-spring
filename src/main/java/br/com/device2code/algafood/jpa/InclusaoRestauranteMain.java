package br.com.device2code.algafood.jpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.device2code.algafood.AlgafoodApiApplication;
import br.com.device2code.algafood.domain.model.Restaurante;
import br.com.device2code.algafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Bra XPTO");
		restaurante1.setTaxaFrete(new BigDecimal(2.9));
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Ind XPTO");
		restaurante2.setTaxaFrete(new BigDecimal(1.1));
		
		
		restaurante1 = restauranteRepository.salvar(restaurante1);
		restaurante2 = restauranteRepository.salvar(restaurante2);
		
		System.out.printf("Restaurante " + restaurante1.getNome() 
						+ " com taxa de frete: " + restaurante1.getTaxaFrete() 
						+ " adicionado com sucesso\n");
		
		System.out.printf("Restaurante " + restaurante2.getNome() 
		+ " com taxa de frete: " + restaurante2.getTaxaFrete() 
		+ " adicionado com sucesso\n");		
	}	
}