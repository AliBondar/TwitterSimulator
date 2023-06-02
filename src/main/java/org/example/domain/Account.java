package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;
import org.example.domain.enumeration.AccountType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account extends BaseEntity<Long> {

    String username;

    String password;

    @Email
    String email;

    @ManyToOne
    User user;

    @Enumerated
    AccountType accountType;

    boolean hasBlueTick;
}
