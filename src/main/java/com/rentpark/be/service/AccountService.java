package com.rentpark.be.service;

import com.rentpark.be.exception.AccountNotFoundException;
import com.rentpark.be.input.AccountInput;
import com.rentpark.be.model.Account;
import com.rentpark.be.repository.AccountRepository;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account save (AccountInput input) {
        Account instance = new Account();
        instance.setNames(input.getNames());
        instance.setLastName(input.getLastName());
        instance.setEmail(input.getEmail());
        instance.setPassword(input.getPassword());
        instance.setPhone(input.getPhone());
        instance.setBirthDate(input.getBirthDate());
        return accountRepository.save(instance);
    }

    public Account findById(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found by id: " + id));
    }
}
