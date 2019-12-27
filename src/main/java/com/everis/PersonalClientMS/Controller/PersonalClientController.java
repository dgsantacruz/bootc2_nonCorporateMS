package com.everis.PersonalClientMS.Controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.everis.PersonalClientMS.DTO.PersonalClientDTO;
import com.everis.PersonalClientMS.Model.PersonalClient;
import com.everis.PersonalClientMS.Service.PersonalClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/pclients")
public class PersonalClientController
{
    //Create instance of business layer implementation
    @Autowired
    private PersonalClientService service;

    //Get all clients
    @GetMapping("/all")
    public Flux<PersonalClient> getAllClient() 
    {
        return service.findAllClients();
    }

    //Get all clients (DTO)
    @GetMapping("/alldto")
    public Flux<PersonalClientDTO> getAllClientDTO() 
    {
        return service.findAllClients()
                        .map(client -> new PersonalClientDTO(client.getDni(), client.getName()));
    }

    //Get client By Dni
    @GetMapping("/dni/{dni}")
    public Mono<PersonalClient> getClientByDni(@PathVariable String dni)
    {
        return service.findByDni(dni);
    }

    //Get client By Dni (DTO)
    @GetMapping("/dnidto/{dni}")
    public Mono<PersonalClientDTO> getClientByDniDTO(@PathVariable String dni)
    {
        return null; //service.findByDni(dni);
    }

    //Get client By Name
    @GetMapping("/name/{name}")
    public Flux<PersonalClient> getClientsByName(@PathVariable String name)
    {
        return service.findByName(name);
    }

    //Get client By Name (DTO)
    @GetMapping("/namedto/{name}")
    public Flux<PersonalClientDTO> getClientsByNameDTO(@PathVariable String name)
    {
        return service.findByNameDTO(name);
    }

    //Get client By Phone
    @GetMapping("/phone/{phone}")
    public Mono<PersonalClient> getClientsByPhone(@PathVariable String phone)
    {
        return service.findByPhone(phone);
    }

    //Get client By Phone (DTO)
    @GetMapping("/phonedto/{phone}")
    public Mono<PersonalClientDTO> getClientsByPhoneDTO(@PathVariable String phone)
    {
        return service.findByPhoneDTO(phone);
    }

    //Create new Personal Client
    @PostMapping
    public Mono<PersonalClient> createClient(@RequestBody PersonalClient client)
    {
        return service.addClient(client);
    }

    //Edit client
    @PutMapping("/edit/{dni}")
    public Mono<PersonalClient> editClient(@RequestBody PersonalClient client, @PathVariable String dni)
    {
        return service.findByDni(dni)
                        .flatMap(c -> 
                        {
                            c.setDni(client.getDni());
                            c.setName(client.getName());
                            c.setPhone(client.getPhone());
                            return service.addClient(client);
                        }
        );
    }
    
    //Delete client
    @DeleteMapping("/delete/{dni}")
    public Mono<Void> deleteClient(@PathVariable String dni)
    {
        return service.findByDni(dni).flatMap(client -> service.delClient(client));
    }


}