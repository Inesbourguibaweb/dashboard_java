package com.dashboard.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dashboard.dashboard.model.Collaborateur;
import com.dashboard.dashboard.repository.CollaborateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CollaborateurService {
    private final CollaborateurRepository collabRepo;

    public List<Collaborateur> findAll() {
        return collabRepo.findAll();
    }

    public Collaborateur save(Collaborateur collab) {
        return collabRepo.save(collab);
    }
}

