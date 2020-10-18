package br.com.device2code.algafood.domain.repository;

import java.util.List;

import br.com.device2code.algafood.domain.model.Estado;

public interface EstadoRepository {
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Long id);
}
