package com.everis.noncorporate.Repository;

//import java.util.Date;

import com.everis.noncorporate.Model.NonCorpClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NonCorpClientRepo extends ReactiveMongoRepository<NonCorpClient, String> {
	
    public Flux<NonCorpClient> findAllByName(String fistname);

    public Flux<NonCorpClient> findAllByLastName(String lastname);
    
    public Mono<NonCorpClient> findByDni(String dni);

    public Mono<NonCorpClient> findByPhone(String phone);

    public Flux<NonCorpClient> findAllByAddress(String address);
	
	//public Flux<nonCorpClient> findByDateBirthBetween(Date firstDate, Date lastDate);
}