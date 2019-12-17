package com.everis.PersonalClientMS.Controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.everis.PersonalClientMS.Model.PersonalClient;
import com.everis.PersonalClientMS.Service.PersonalClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/pclients")
public class PersonalClientController
{
    //Create instance of business layer implementation
    @Autowired
    private PersonalClientService service;

    //Create new Personal Client
    @PostMapping("/create")
    private Mono<PersonalClient> createClient(PersonalClient client)
    {
        return service.addClient(client);
    }

    //Get all clients
    @GetMapping("/all")
    public Flux<PersonalClient> getAllClient() 
    {
        return service.findAllClients();
    }
}