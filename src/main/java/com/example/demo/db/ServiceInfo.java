package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ServiceInfo {
    @Autowired
    private AccountRepository accountRepository;

    @PostConstruct
    public void init() {
        Optional<Account> account = accountRepository.findById(1L);
        System.out.println(account);
    }
}
