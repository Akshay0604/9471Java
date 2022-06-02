package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {

        this.accountService = accountService;
    }

    @GetMapping(path = "/accounts/{accountNumber}")
    public Account getAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountService.getAccount(accountNumber);
    }
}