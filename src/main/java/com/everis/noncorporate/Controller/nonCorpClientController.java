package com.everis.noncorporate.Controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.everis.noncorporate.Model.nonCorpClient;
import com.everis.noncorporate.Service.nonCorpClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class nonCorpClientController
{
    //Create instance of the 
    @Autowired
    private nonCorpClientService service;

    @GetMapping("/id/all")
    public Flux<nonCorpClient> findAllClient() 
    {
        return service.findAllClients();
    }

    @GetMapping("/id/{id}")
    private Mono<nonCorpClient> getById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    private Mono<nonCorpClient> addClient(nonCorpClient noncorpclient)
    {
        return service.saveClient(noncorpclient);
    }

    @DeleteMapping("/client/{id}")
    public Mono<Void> deleteClient(nonCorpClient noncorpclient)
    {
        return service.deleteClient(noncorpclient);
    }
    

    
}