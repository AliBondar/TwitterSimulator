package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.Entity;
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

    List<Comment> commentList;

    List<Like> likeList;

    int numberOfLikes;

    Account account;


}
