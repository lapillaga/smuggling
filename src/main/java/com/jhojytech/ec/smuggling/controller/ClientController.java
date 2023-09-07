package com.jhojytech.ec.smuggling.controller;

import com.jhojytech.ec.smuggling.model.Client;
import com.jhojytech.ec.smuggling.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public List<Client> findAll() {
        return clientService.findAll();
    }
}
