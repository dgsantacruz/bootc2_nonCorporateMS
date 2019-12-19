package com.everis.PersonalClientMS.Service;

import com.everis.PersonalClientMS.DTO.PersonalClientDTO;
//Imports Model class
import com.everis.PersonalClientMS.Model.PersonalClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientService { 
    
    //Get All Clients
    public Flux<PersonalClient> findAllClients();

    // //Get all Clients (DTO)
    // public Flux<PersonalClientDTO> findAllClientsDTO();
    
    //Get client By Dni
    public Mono<PersonalClient> findByDni(String dni);

    // //Get client By Dni (DTO)
    // public Mono<PersonalClientDTO> findByDniDTO(String dni);

    //Get client By Name
    public Flux<PersonalClient> findByName(String name);

    //Get client By Phone
    public Mono<PersonalClient> findByPhone(String phone);
    
    //Create Client
    public Mono<PersonalClient> addClient(PersonalClient client);

    //Delete Client
    public Mono<Void> delClient(PersonalClient client);
 	
}