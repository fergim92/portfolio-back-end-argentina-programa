package com.portfolio.mgb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.Repository.IPersonaRepository;

@Service
public class ImpPersonaService implements IPersonaService{

	@Autowired IPersonaRepository ipersonaRepository;
	
	public List<Persona> getpersona() {
		List<Persona> persona = ipersonaRepository.findAll();
		return persona;
	}

	public void savePersona(Persona persona) {
		ipersonaRepository.save(persona);
	}

	public void deletePersona(long id) {
		ipersonaRepository.deleteById(id);
	}

	public Persona findPersona(Long id) {
		Persona persona = ipersonaRepository.findById(id).orElse(null);
		return persona;
	}
	
}
