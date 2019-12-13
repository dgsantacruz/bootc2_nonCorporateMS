package com.everis.PersonalClientMS.Repository;

//import java.util.Date;

import com.everis.PersonalClientMS.Model.PersonalClient;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonalClientRepo extends ReactiveMongoRepository<PersonalClient, String> 
{
	
}