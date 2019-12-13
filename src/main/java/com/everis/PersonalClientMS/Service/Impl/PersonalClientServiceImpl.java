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

    @Override
    public Flux<PersonalClient> findAllClients() {
        return repo.findAll();
    }

    @Override
    public Mono<PersonalClient> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public Mono<PersonalClient> saveClient(PersonalClient client) {
        return repo.save(client);
    }

    @Override
    public Mono<Void> deleteClient(PersonalClient client) {
        return repo.delete(client);
    }

}