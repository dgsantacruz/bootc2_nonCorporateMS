package com.everis.noncorporate.Repository;

//import java.util.Date;

import com.everis.noncorporate.Model.nonCorpClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface nonCorpClientRepo extends ReactiveMongoRepository<nonCorpClient, String> {
	
    public Flux<nonCorpClient> findAllByName(String fistname);

    public Flux<nonCorpClient> findAllByLastName(String lastname);
    
    public Mono<nonCorpClient> findByDni(String dni);

    public Mono<nonCorpClient> findByPhone(String phone);

    public Flux<nonCorpClient> findAllByAddress(String address);
	
	//public Flux<nonCorpClient> findByDateBirthBetween(Date firstDate, Date lastDate);
}