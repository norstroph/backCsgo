package com.csgo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Games")
public class Game {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    protected Long id;
    protected String name;
    protected String date;

    public Game() {
    }

    // Constructeur
    public Game(String title, String date) {
        this.name = title;
        this.date = date;
    }

    // Getters / Setters obligatoires pour JSON
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}