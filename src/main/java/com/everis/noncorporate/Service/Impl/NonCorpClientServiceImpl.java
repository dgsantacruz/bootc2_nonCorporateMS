package com.everis.noncorporate.Service.Impl;

import com.everis.noncorporate.Model.NonCorpClient;
import com.everis.noncorporate.Repository.NonCorpClientRepo;
import com.everis.noncorporate.Service.NonCorpClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NonCorpClientServiceImpl implements NonCorpClientService {

    //Autowired creates an instance of a class that is labeled as component: @Service, @Restcontroller, etc...
    @Autowired
    private NonCorpClientRepo repo;

    @Override
    public Flux<NonCorpClient> findAllClients() {
        return repo.findAll();
    }

    @Override
    public Mono<NonCorpClient> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public Mono<NonCorpClient> saveClient(NonCorpClient noncorpclient) {
        return repo.save(noncorpclient);
    }

    @Override
    public Mono<Void> deleteClient(NonCorpClient noncorpclient) {
        return repo.delete(noncorpclient);
    }

}