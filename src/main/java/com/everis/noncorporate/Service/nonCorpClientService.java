package com.everis.noncorporate.Service;

import com.everis.noncorporate.Model.nonCorpClient;
import com.everis.noncorporate.Repository.nonCorpClientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class nonCorpClientService implements nonCorpClientInterface {

    //Autowired creates an instance of a class that is labeled as component: @Service, @Restcontroller, etc...
    @Autowired
    private nonCorpClientRepo repo;

    @Override
    public Flux<nonCorpClient> findAllClients() {
        return repo.findAll();
    }

    @Override
    public Mono<nonCorpClient> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public Mono<nonCorpClient> saveClient(nonCorpClient noncorpclient) {
        return repo.save(noncorpclient);
    }

    @Override
    public Mono<Void> deleteClient(nonCorpClient noncorpclient) {
        return repo.delete(noncorpclient);
    }

}