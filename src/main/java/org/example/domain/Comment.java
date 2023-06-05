package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.domain.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment extends BaseEntity<Long> {

    @Column(length = 280)
    String text;

    @ManyToOne
    Account account;

    LocalDate localDate;

    @OneToMany
    List<Like> likeList;

    int numberOfLikes;

}
