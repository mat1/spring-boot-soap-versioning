/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package com.example.demo;

import java.util.List;

public class Abo {

    private long id;
    private String name;
    private List<String> zonen;

    public Abo() {
    }

    public Abo(long id, String name, List<String> zonen) {
        this.id = id;
        this.name = name;
        this.zonen = zonen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getZonen() {
        return zonen;
    }

    public void setZonen(List<String> zonen) {
        this.zonen = zonen;
    }
}
