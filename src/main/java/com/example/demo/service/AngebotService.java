/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package com.example.demo.service;

import java.util.Arrays;

import com.example.demo.Abo;
import com.example.demo.AngebotAnfrage;
import com.example.demo.v1.Angebot;

public class AngebotService {

    public Angebot getAngebote(AngebotAnfrage angebotAnfrage) {
        // Do some business logic call other services
        System.out.println("Business Logic: " + angebotAnfrage);

        return new Angebot(1, "Tageskarte");
    }

    public Abo getAbo(AngebotAnfrage angebotAnfrage) {
        // Do some business logic call other services
        System.out.println("Business Logic: " + angebotAnfrage);

        return new Abo(1, "Unireso Abo", Arrays.asList("10", "20"));
    }
}
