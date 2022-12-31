package com.portfolio.mgb.Security.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolNombre;
import com.portfolio.mgb.Security.Repository.IRolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
	@Autowired
	IRolRepository irolRepository;
	
	public Optional<Rol> getByNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol) {
		irolRepository.save(rol);
	}
}
