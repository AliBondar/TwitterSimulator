package org.example.domain;

import java.time.LocalDate;
import java.util.List;

public class Tweet {
    private String text;

    private LocalDate localDate;

    private List<Like> likeList;

    private long numberOfLikes;

    private Account account;
}
