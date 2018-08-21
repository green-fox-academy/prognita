package com.greenfox.reddit.model;

import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String title;
    private String url;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime timestamp;
    private int score;

    @OneToMany(mappedBy ="post")
    private List<Vote> vote = new ArrayList<>();

    private String owner;


    private Post() {
        this.timestamp = LocalDateTime.now();
        this.owner="Krisz";
        this.score=0;
    }

    public Post(String title, String url, LocalDateTime timestamp, int score, List<Vote> vote, String owner) {
        this.title = title;
        this.url = url;
        this.timestamp = LocalDateTime.now();
        this.score = score;
        this.vote = vote;
        this.owner = owner;
    }


    public List<Vote> getVote() {
        return vote;
    }

    public void setVote(List<Vote> vote) {
        this.vote = vote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void incrementScore() {
        score++;

    }

    public void decrementScore() {
        score--;

    }

}
