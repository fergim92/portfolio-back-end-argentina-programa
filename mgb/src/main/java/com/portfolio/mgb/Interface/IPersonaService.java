package com.portfolio.mgb.Interface;

import java.util.List;
import com.portfolio.mgb.Entity.Persona;


public interface IPersonaService {
	public List<Persona>getpersona();
	
	public void savePersona(Persona persona);
	
	public void deletePersona(long id);
	
	public Persona findPersona(Long id);
}
