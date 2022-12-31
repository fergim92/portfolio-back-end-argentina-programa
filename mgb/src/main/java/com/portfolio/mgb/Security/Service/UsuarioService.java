package com.portfolio.mgb.Security.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.IUsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
	@Autowired
	IUsuarioRepository iusuarioRepository;
	
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
		return iusuarioRepository.findByNombreUsuario(nombreUsuario);	
	}

	public boolean existByNombreUsuario(String nombreUsuario) {
		return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	public boolean existByEmail(String email) {
		return iusuarioRepository.existsByEmail(email);
	}
	
	public void save(Usuario usuario) {
		iusuarioRepository.save(usuario);
	}
	
	
	
	
}
	