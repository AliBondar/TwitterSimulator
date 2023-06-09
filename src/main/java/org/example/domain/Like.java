package org.example.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "likes")
public class Like extends BaseEntity<Long> {

    @ManyToOne(cascade = CascadeType.ALL)
    Account account;

    @ManyToOne(cascade = CascadeType.ALL)
    Tweet tweet;

}
