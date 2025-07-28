package com.dashboard.dashboard.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dashboard.dashboard.model.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByClientId(String clientId);
    List<Transaction> findByClientIdAndPayee(String clientId, boolean payee);
    List<Transaction> findByPayee(boolean payee);
}

