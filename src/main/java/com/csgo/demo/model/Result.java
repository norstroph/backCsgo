package com.csgo.demo.model;
import jakarta.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int score;
    public Result() {}

    public Result( int id, int score){

        this.id = id;
        this.score = score;

    }


    public int getIdREsult() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
