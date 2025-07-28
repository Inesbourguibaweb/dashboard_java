package com.dashboard.dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dashboard.dashboard.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {}
