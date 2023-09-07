package com.jhojytech.ec.smuggling.service;

import com.jhojytech.ec.smuggling.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client createClient();
}
