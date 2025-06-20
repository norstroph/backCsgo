package com.csgo.demo.model;

import jakarta.persistence.Entity;


public class Team {
    private int id;
    private String playerName;
    private int numberOfPlayer;
    private String logo;
    private String name;

    public Team( int id, String playerName, int numberOfPlayer, String logo,String name) {
        this.id = id;
        this.playerName = playerName;
        this.numberOfPlayer = numberOfPlayer;
        this.logo = logo;
        this.name = name;

    }

    public String getPlayerName() {
        return playerName;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public String getLogo() {
        return logo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}