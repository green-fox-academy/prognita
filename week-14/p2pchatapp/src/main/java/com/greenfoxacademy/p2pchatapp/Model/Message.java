package com.greenfoxacademy.p2pchatapp.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    private long id;
    private String timestamp;
    private String username;
    private String text;

    public Message() {
        this.timestamp = LocalDateTime.now().toString();

    }

    public Message(long id, String timestamp, String username, String text) {
        this.id = randomGeneratedId();
        this.timestamp = LocalDateTime.now().toString();
        this.username = username;
        this.text = text;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private long randomGeneratedId() {
        return (long) (Math.random() * 99999999 + 1000000 );
    }
}
