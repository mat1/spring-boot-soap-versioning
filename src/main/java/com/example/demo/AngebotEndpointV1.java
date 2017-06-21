/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package com.example.demo;

import com.example.demo.v1.Angebot;
import com.example.demo.service.AngebotService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class AngebotEndpointV1
{

    public AngebotEndpointV1() {

    }

    @WebMethod
    public Angebot getAngebot(@WebParam(name = "angebotAnfrage") AngebotAnfrage angebotAnfrage)
    {
        // Map V2 to V1
        com.example.demo.v2.Angebot angebot = new AngebotService().getAngebote(angebotAnfrage);

        return new Angebot(1, angebot.getName());
    }

    @WebMethod
    public Abo getAbo(@WebParam(name = "angebotAnfrage") AngebotAnfrage angebotAnfrage)
    {
        return new AngebotService().getAbo(angebotAnfrage);
    }
}
