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

import com.exemplo.demo.entity.Destino;
import com.exemplo.demo.repository.DestinosRepository;

@RestController
@RequestMapping("/destinos")
@CrossOrigin(origins = "http://localhost:3000")       //Permissão para o cliente no endereço localhost 3000 consumir a api
public class DestinoService {
	
	@Autowired
	private DestinosRepository destinosRepository;
	
	@GetMapping
	public List<Destino> findAll() {
		return destinosRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Destino> findById(@PathVariable Long id) {
		return destinosRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Destino save(@RequestBody Destino destino) {
		return destinosRepository.save(destino);
	}
	
	@PutMapping(path = "/{id}")
	public void update(@RequestBody Destino destino, @PathVariable Long id) {
		Optional<Destino> optionaldestino = this.destinosRepository.findById(id);
		
		if(optionaldestino.isPresent()) {
			this.destinosRepository.save(destino);
		} else {
			System.out.println("Destino não existe");
		}
		
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Destino> optionaldestino = this.destinosRepository.findById(id);
		
		if(optionaldestino.isPresent()) {
			destinosRepository.delete(optionaldestino.get());
		}else {
			System.out.println("Destino não existe");
		}
		
	}
}
