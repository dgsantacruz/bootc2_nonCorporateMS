package com.everis.PersonalClientMS.Service;

//Imports Model class
import com.everis.PersonalClientMS.Model.PersonalClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientService { 
    
    //Get All Clients
    public Flux<PersonalClient> findAllClients();
    
    //Get client By Dni
    public Mono<PersonalClient> findByDni(String dni);

    //Get client By Name
    public Flux<PersonalClient> findByName(String name);

    //Get client By Phone
    public Mono<PersonalClient> findByPhone(String phone);
    
    //Create Client
    public Mono<PersonalClient> addClient(PersonalClient client);

    //Delete Client
    public Mono<Void> delClient(PersonalClient client);
 	
}