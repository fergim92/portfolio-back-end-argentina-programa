package com.portfolio.mgb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.mgb.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
