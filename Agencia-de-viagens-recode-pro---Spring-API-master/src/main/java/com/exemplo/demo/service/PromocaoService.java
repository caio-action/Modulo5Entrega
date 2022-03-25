package com.exemplo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.entity.Promocao;
import com.exemplo.demo.repository.PromocoesRepository;

@RestController
@RequestMapping("/promocoes")
@CrossOrigin(origins = "http://localhost:3000")
public class PromocaoService {
	
	@Autowired
	private PromocoesRepository promocoesRepository;
	
	@GetMapping
	public List<Promocao> findAll() {
		return promocoesRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Promocao> findById(@PathVariable Long id) {
		return promocoesRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Promocao save(@RequestBody Promocao promocao) {
		return promocoesRepository.save(promocao);
	}
	
	@PutMapping
	public void update(@RequestBody Promocao promocao) {
		promocoesRepository.save(promocao);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		promocoesRepository.deleteById(id);
	}
}
