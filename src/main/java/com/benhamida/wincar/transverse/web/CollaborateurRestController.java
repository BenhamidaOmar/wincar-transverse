package com.benhamida.wincar.transverse.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benhamida.wincar.transverse.entities.Collaborateur;
import com.benhamida.wincar.transverse.repository.CollaborateurRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/collaborateurs")
@AllArgsConstructor
public class CollaborateurRestController {

    private final CollaborateurRepository collaborateurRepository;

    @GetMapping
    public List<Collaborateur> getAll() {
        return collaborateurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Collaborateur getById(@PathVariable Long id) {
        return collaborateurRepository.findById(id).orElse(null);
    }
}

