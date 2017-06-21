package com.example.demo;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private Bus bus;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean wsDispatcherServlet() {
        CXFServlet cxfServlet = new CXFServlet();
        return new ServletRegistrationBean(cxfServlet, "/services/*");
    }

    @Bean
    public Endpoint endpointV1() {
        EndpointImpl endpoint = new EndpointImpl(bus, new AngebotEndpointV1());
        endpoint.publish("/v1/AngebotService");
        return endpoint;
    }

    @Bean
    public Endpoint endpointV2() {
        EndpointImpl endpoint = new EndpointImpl(bus, new AngebotEndpointV2());
        endpoint.publish("/v2/AngebotService");
        return endpoint;
    }
}
