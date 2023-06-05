package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;
import org.example.domain.enumeration.Gender;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User extends BaseEntity<Long> {

    String firstName;

    String lastName;

    Integer age;

    String country;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")

    List<Account> accountList;
}
