package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tweet extends BaseEntity<Long> {


    String text;

    LocalDate localDate;

    @OneToMany
    List<Comment> commentList;

    @OneToMany
    List<Like> likeList;

    int numberOfLikes;

    @ManyToOne
    Account account;


}
