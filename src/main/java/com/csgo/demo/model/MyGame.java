package com.csgo.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyGame {
    private int id;
    private Winner winner;

    public Winner getWinner() { return winner; }
    public void setWinner(Winner winner) { this.winner = winner; }
}
