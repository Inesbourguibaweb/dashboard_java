package com.dashboard.dashboard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.dashboard.model.Transaction;
import com.dashboard.dashboard.repository.TransactionRepository;
import com.dashboard.dashboard.service.CollaborateurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionRepository repo;
    private final CollaborateurService service;
    
    @GetMapping
    public List<Transaction> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return repo.save(transaction);
    }

    @GetMapping("/client/{clientId}")
    public List<Transaction> getByClient(@PathVariable String clientId) {
        return repo.findByClientId(clientId);
    }
}
