package com.everis.noncorporate.Controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.everis.noncorporate.Model.NonCorpClient;
import com.everis.noncorporate.Service.NonCorpClientService;

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
    private NonCorpClientService service;

    @GetMapping("/id/all")
    public Flux<NonCorpClient> findAllClient() 
    {
        return service.findAllClients();
    }

    @GetMapping("/id/{id}")
    private Mono<NonCorpClient> getById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    private Mono<NonCorpClient> addClient(NonCorpClient noncorpclient)
    {
        return service.saveClient(noncorpclient);
    }

    @DeleteMapping("/client/{id}")
    public Mono<Void> deleteClient(NonCorpClient noncorpclient)
    {
        return service.deleteClient(noncorpclient);
    }
    

    
}