package com.benhamida.wincar.transverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benhamida.wincar.transverse.entities.Collaborateur;





	@Repository
	public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {

	}

