package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){

        this.accountRepository = accountRepository;
    }
    public Account getAccount(String accountNumber){
        return  accountRepository.findAccount(accountNumber);
    }
}
