/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package com.example.demo;

public class AngebotAnfrage {

    private String from;
    private String to;

    public AngebotAnfrage() {
    }

    public AngebotAnfrage(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "AngebotAnfrage{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
