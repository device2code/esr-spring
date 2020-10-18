package br.com.device2code.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.device2code.algafood.domain.exception.EntidadeNaoEncontradaException;
import br.com.device2code.algafood.domain.model.Cozinha;
import br.com.device2code.algafood.domain.model.Restaurante;
import br.com.device2code.algafood.domain.repository.CozinhaRepository;
import br.com.device2code.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if (cozinha == null) {
			throw new EntidadeNaoEncontradaException(
				String.format("Não existe cadastro de cozinha com código %d", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha);
				
		return restauranteRepository.salvar(restaurante);
	}
}
