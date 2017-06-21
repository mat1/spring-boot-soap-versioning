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
        return new AngebotService().getAngebote(angebotAnfrage);
    }

    @WebMethod
    public Abo getAbo(@WebParam(name = "angebotAnfrage") AngebotAnfrage angebotAnfrage)
    {
        return new AngebotService().getAbo(angebotAnfrage);
    }
}
