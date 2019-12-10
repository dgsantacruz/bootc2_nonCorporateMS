package com.everis.noncorporate.Service;

//Imports Model class
import com.everis.noncorporate.Model.NonCorpClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NonCorpClientService {
    
    //This method helps group clients before add them to the db?
    public Flux<NonCorpClient> findAllClients();

    public Mono<NonCorpClient> findById(String id);

    public Mono<NonCorpClient> saveClient(NonCorpClient noncorpclient);
	    
    public Mono<Void> deleteClient(NonCorpClient noncorpclient);
	
}