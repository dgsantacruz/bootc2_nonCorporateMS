package com.everis.PersonalClientMS.Repository;

//import java.util.Date;

import com.everis.PersonalClientMS.Model.PersonalClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientRepo extends ReactiveMongoRepository<PersonalClient, String> 
{
    Mono<PersonalClient> findByDni(String dni);
    
    Flux<PersonalClient> findByName(String name);

    Mono<PersonalClient> findByPhone(String phone);
}