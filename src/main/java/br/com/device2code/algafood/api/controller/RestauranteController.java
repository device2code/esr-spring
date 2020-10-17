package br.com.device2code.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.device2code.algafood.domain.model.Restaurante;
import br.com.device2code.algafood.domain.repository.RestauranteRepository;

@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteController {
	
	@Autowired
	private RestauranteRepository restauranteRespository;
	
	@GetMapping
	public List<Restaurante> listar() {
		return restauranteRespository.listar();
	}
	
	@GetMapping("/{restauranteId}")
	public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId) {
		Restaurante restaurante = restauranteRespository.buscar(restauranteId);
		
		if (restaurante != null) {
			return ResponseEntity.ok(restaurante);
		}
		
		return ResponseEntity.notFound().build();
	}
}
