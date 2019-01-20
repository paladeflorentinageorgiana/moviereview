package com.feea.moviereview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Date release_date;
    private Integer budget;
    private String genre;

    protected Movie(){}

    public Movie(String name, Date release_date, Integer budget, String genre) {
        this.name = name;
        this.release_date = release_date;
        this.budget = budget;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
