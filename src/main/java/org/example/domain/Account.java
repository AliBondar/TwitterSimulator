package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;
import org.example.domain.enumeration.AccountType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account extends BaseEntity<Long> {

    @Column(unique = true, nullable = false)
    String username;

    String password;

    @Email
    String email;

//    @ManyToOne
//    User user;

    @Enumerated(EnumType.STRING)
    AccountType accountType;

    Boolean hasBlueTick;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    List<Tweet> tweetList = new ArrayList<>();
}
