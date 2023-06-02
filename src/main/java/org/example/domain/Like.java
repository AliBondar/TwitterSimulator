package org.example.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Like extends BaseEntity<Long> {

    @ManyToOne
    Account account;

    @ManyToOne
    Tweet tweet;


}
