package com.portfolio.mgb.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolNombre;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
