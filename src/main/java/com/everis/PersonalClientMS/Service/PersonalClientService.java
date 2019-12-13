package com.everis.PersonalClientMS.Service;

//Imports Model class
import com.everis.PersonalClientMS.Model.PersonalClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientService {    
    
    //Create Client
    public Mono<PersonalClient> addClient(PersonalClient client);

    //Delete Client
    public Mono<Void> deleteClient(PersonalClient client);

    //Get All Clients
    public Flux<PersonalClient> findAllClients();    	
}