package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.domain.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tweet extends BaseEntity<Long> {

    @Column(length = 280)
    String text;

//    @ManyToOne
//    Account account;

    LocalDate localDate;

//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "tweet_id")
//    List<Like> likeList = new ArrayList<>();

    Integer numberOfLikes;

    @OneToMany
    List<Tweet> TweetList = new ArrayList<>();


}
