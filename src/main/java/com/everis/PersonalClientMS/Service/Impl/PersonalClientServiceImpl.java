package com.everis.PersonalClientMS.Service.Impl;

import com.everis.PersonalClientMS.DTO.PersonalClientDTO;
import com.everis.PersonalClientMS.Model.PersonalClient;
import com.everis.PersonalClientMS.Repository.PersonalClientRepo;
import com.everis.PersonalClientMS.Service.PersonalClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalClientServiceImpl implements PersonalClientService {

    //Autowired creates an instance of a class that is labeled as component: @Service, @Restcontroller, etc...
    @Autowired
    private PersonalClientRepo repo;

    //Get All Clients
    @Override
    public Flux<PersonalClient> findAllClients()
    {
        return repo.findAll();
    }


    //Get all clients (DTO)
    @Override
    public Flux<PersonalClientDTO> findAllClientsDTO() 
    {
        return repo.findAll().map(client -> new PersonalClientDTO(client.getDni(), client.getName()));
    }

    //Get client by Dni
    @Override
    public Mono<PersonalClient> findByDni(String dni) 
    {
        return repo.findByDni(dni);
    }
    
    //Get client by Dni (DTO)
    @Override
    public Mono<PersonalClientDTO> findByDniDTO(String dni)
    {
        return repo.findByDni(dni).map(client -> new PersonalClientDTO(client.getDni(), client.getName()));
    }

    @Override
    public Flux<PersonalClient> findByName(String name) 
    {
        return repo.findByName(name);
    }

    //Get client by Name (DTO)
    @Override
    public Flux<PersonalClientDTO> findByNameDTO(String name) 
    {
        return repo.findByName(name).map(client -> new PersonalClientDTO(client.getDni(), client.getName()));
    }

    //Get client by Phone
    @Override
    public Mono<PersonalClient> findByPhone(String phone)
    {
        return repo.findByPhone(phone);
    }

    //Get client by Phone (DTO)
    @Override
    public Mono<PersonalClientDTO> findByPhoneDTO(String phone)
    {
        return repo.findByPhone(phone).map(client -> new PersonalClientDTO(client.getDni(), client.getName()));
    }

    //Create Client
    @Override
    public Mono<PersonalClient> addClient(PersonalClient client) 
    {
        return repo.save(client);
    }

    //Delete Client
    @Override
    public Mono<Void> delClient(PersonalClient client) 
    {
        return repo.delete(client);
    }

    }