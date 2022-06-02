package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("select a from Account a where a.accountNumber = ?1")
    public Account findAccount(String accountNumber);

}