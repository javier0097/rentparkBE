package com.rentpark.be.input;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class AccountInput {
    private String names;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Date birthDate;
}
