package com.feea.moviereview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer movieId;
    private String username;
    private String comment;

    public Integer getId() {
        return id;
    }

    protected Review(){}

    public Review(Integer movieId, String username, String comment) {
        this.movieId = movieId;
        this.username = username;
        this.comment = comment;
    }

    public Review(String movieId, String username, String comment) {
        this.movieId = Integer.parseInt(movieId);
        this.username = username;
        this.comment = comment;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
