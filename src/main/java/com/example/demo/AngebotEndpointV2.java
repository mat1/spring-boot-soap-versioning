/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package com.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.example.demo.service.AngebotService;
import com.example.demo.v2.Angebot;

@WebService
public class AngebotEndpointV2
{

    public AngebotEndpointV2() {

    }

    @WebMethod
    public Angebot getAngebot(@WebParam(name = "angebotAnfrage") AngebotAnfrage angebotAnfrage)
    {
        com.example.demo.v1.Angebot angebot = new AngebotService().getAngebote(angebotAnfrage);
        // Map V1 to V2
        return new Angebot(angebot.getName());
    }

    @WebMethod
    public Abo getAbo(@WebParam(name = "angebotAnfrage") AngebotAnfrage angebotAnfrage)
    {
        return new AngebotService().getAbo(angebotAnfrage);
    }
}
