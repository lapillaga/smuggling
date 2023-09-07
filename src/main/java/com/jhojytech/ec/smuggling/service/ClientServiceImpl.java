package com.jhojytech.ec.smuggling.service;

import com.jhojytech.ec.smuggling.model.Client;
import com.jhojytech.ec.smuggling.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client createClient() {
        return clientRepository.save(new Client(
                null,
                "Luis Pillaga",
                "lpillaga@gmail.com",
                "1234567890",
                "0301971495"
        ));
    }
}
