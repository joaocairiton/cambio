package com.cairiton.cambioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cairiton.cambioservice.model.Cambio;


public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);

}
