package com.csgo.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchData {

    private String modifiedAt;
    private int winnerId;
    private boolean forfeit;
    private String scheduledAt;
    private String originalScheduledAt;
    private String winnerType;
    private boolean rescheduled;
    private MyGame[] games;

    // Getters et setters
    public MyGame[] getGames() { return games; }
    public void setGames(MyGame[] games) { this.games = games; }
}

