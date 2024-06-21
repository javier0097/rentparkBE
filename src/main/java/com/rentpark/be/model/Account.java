package com.rentpark.be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String names;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
}
