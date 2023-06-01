package org.example.domain;

import org.example.base.domain.BaseEntity;
import org.example.domain.enumeration.Gender;

import java.util.List;

public class User extends BaseEntity<Long> {

    private String firstName;

    private String lastName;

    private int age;

    private String country;

    private Gender gender;

    private List<Account> accountList;
}
