package br.com.device2code.algafood.domain.repository;

import java.util.List;

import br.com.device2code.algafood.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);	
}
