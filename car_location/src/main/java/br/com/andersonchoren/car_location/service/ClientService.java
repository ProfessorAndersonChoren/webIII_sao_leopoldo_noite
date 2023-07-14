package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.ClientModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientService implements IService<ClientModel>{
    @Override
    public ClientModel save(ClientModel object) {
        return null;
    }

    @Override
    public List<ClientModel> findAll() {
        return null;
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {

    }
}
