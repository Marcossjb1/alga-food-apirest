package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Client;

public class ClientActivationService {

    public void activationOfClient(Client client){
        client.isActivated();
    }
}
