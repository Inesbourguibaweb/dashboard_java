package com.dashboard.dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dashboard.dashboard.model.Collaborateur;

public interface CollaborateurRepository extends MongoRepository<Collaborateur, String> {}
