package com.everis.noncorporate.Service;

//Imports Model class
import com.everis.noncorporate.Model.nonCorpClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface nonCorpClientInterface {
    
    //This method helps group clients before add them to the db?
    public Flux<nonCorpClient> findAllClients();

    public Mono<nonCorpClient> findById(String id);

    public Mono<nonCorpClient> saveClient(nonCorpClient noncorpclient);
	    
    public Mono<Void> deleteClient(nonCorpClient noncorpclient);
	
	//public Flux<nonCorpClient> findAllDateRange(Date firstDate, Date lastDate);

}