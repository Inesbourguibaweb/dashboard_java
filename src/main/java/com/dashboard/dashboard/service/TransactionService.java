package com.dashboard.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dashboard.dashboard.model.Transaction;
import com.dashboard.dashboard.repository.TransactionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository repo;

    public List<Transaction> findAll() {
        return repo.findAll();
    }

    public Transaction save(Transaction t) {
        return repo.save(t);
    }

    public List<Transaction> findByClientId(String clientId) {
        return repo.findByClientId(clientId);
    }

    public List<Transaction> findByClientIdAndPayee(String clientId, boolean payee) {
        return repo.findByClientIdAndPayee(clientId, payee);
    }

    public List<Transaction> findByPayee(boolean payee) {
        return repo.findByPayee(payee);
    }
}
