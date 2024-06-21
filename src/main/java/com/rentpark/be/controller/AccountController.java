package com.rentpark.be.controller;

import com.rentpark.be.input.AccountInput;
import com.rentpark.be.model.Account;
import com.rentpark.be.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")public class AccountController {
    public AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "/{accountId}")
    public Account getById(@PathVariable("accountId") Long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping
    public Account createAccount(@RequestBody AccountInput input) {
        return accountService.save(input);
    }
}
