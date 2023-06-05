package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment extends BaseEntity<Long> {

    @Column(length = 280)
    String text;

    @ManyToOne
    Account account;

    LocalDate localDate;

    @OneToMany
    List<Like> likeList;

    Integer numberOfLikes;

    @OneToMany
    List<Comment> commentList;

    @ManyToOne
    Tweet tweet;
}
