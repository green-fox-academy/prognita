package com.greenfox.reddit.model;

import javafx.geometry.Pos;

import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    boolean isItUpVote;
    private int voteNum;



    public Vote() {

    }

    public Vote(Post post, boolean isItUpVote) {

        this.isItUpVote = isItUpVote;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public boolean isItUpVote() {
        return isItUpVote;
    }

    public void setItUpVote(boolean itUpVote) {
        isItUpVote = itUpVote;
    }
    public int getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(int voteNum) {
        this.voteNum = voteNum;
    }
    public void upvotenum() {
        setVoteNum(1);

    }

    public void downvotenum() {
        setVoteNum(-1);

    }

}

