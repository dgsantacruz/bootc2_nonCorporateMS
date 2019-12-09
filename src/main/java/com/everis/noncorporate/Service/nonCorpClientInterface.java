package com.everis.noncorporate.Service;

//import java.util.Date;
import java.util.List;
import java.util.Map;

//Imports Model class
import com.everis.noncorporate.Model.nonCorpClient;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface nonCorpClientInterface {
    
    //This method helps group clients before add them to the db?
	public Mono<Map<String, Object>> saveClients(List<nonCorpClient> nonCorpClient);
	
	public Mono<nonCorpClient> findId(String id);
	
	public Flux<nonCorpClient> findAllId(List<nonCorpClient> nonCorpClient);
	
	public Flux<nonCorpClient> findAllNames(String names);
	
	//public Flux<nonCorpClient> findAllDateRange(Date firstDate, Date lastDate);

}