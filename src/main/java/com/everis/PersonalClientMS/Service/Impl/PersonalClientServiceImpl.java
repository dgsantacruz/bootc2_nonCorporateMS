package com.everis.PersonalClientMS.Service.Impl;

import com.everis.PersonalClientMS.Model.PersonalClient;
import com.everis.PersonalClientMS.Repository.PersonalClientRepo;
import com.everis.PersonalClientMS.Service.PersonalClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalClientServiceImpl implements PersonalClientService {

    //Autowired creates an instance of a class that is labeled as component: @Service, @Restcontroller, etc...
    @Autowired
    private PersonalClientRepo repo;

    //Create Client
    @Override
    public Mono<PersonalClient> addClient(final PersonalClient client) 
    {
        return repo.save(client);
    }

    //Delete Client
    @Override
    public Mono<Void> deleteClient(final PersonalClient client) 
    {
        return repo.delete(client);
    }

    //Get All Clients
    @Override
    public Flux<PersonalClient> findAllClients() 
    {
        return repo.findAll();
    }
}