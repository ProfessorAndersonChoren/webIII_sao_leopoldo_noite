package br.com.andersonchoren.car_location.repository;

import br.com.andersonchoren.car_location.model.ClientModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientRepository implements IRepository<ClientModel>{
    @Override
    public boolean insert(ClientModel object) {
        return false;
    }

    @Override
    public List<ClientModel> findAll() {
        return null;
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        return Optional.empty();
    }
}
