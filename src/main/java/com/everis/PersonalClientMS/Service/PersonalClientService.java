package com.everis.PersonalClientMS.Service;

//Imports Model class
import com.everis.PersonalClientMS.Model.PersonalClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientService {
    
    //This method helps group clients before add them to the db?
    public Flux<PersonalClient> findAllClients();

    public Mono<PersonalClient> findById(String id);

    public Mono<PersonalClient> saveClient(PersonalClient client);
	    
    public Mono<Void> deleteClient(PersonalClient client);
	
}