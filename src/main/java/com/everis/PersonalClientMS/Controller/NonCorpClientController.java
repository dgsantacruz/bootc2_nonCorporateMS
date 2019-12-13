package com.everis.PersonalClientMS.Controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.everis.PersonalClientMS.Model.PersonalClient;
import com.everis.PersonalClientMS.Service.PersonalClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class NonCorpClientController
{
    //Create instance of the 
    @Autowired
    private PersonalClientService service;

    @GetMapping("/id/all")
    public Flux<PersonalClient> findAllClient() 
    {
        return service.findAllClients();
    }

    @GetMapping("/id/{id}")
    private Mono<PersonalClient> getById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    private Mono<PersonalClient> addClient(PersonalClient client)
    {
        return service.saveClient(client);
    }

    @DeleteMapping("/client/{id}")
    public Mono<Void> deleteClient(PersonalClient client)
    {
        return service.deleteClient(client);
    }
    

    
}