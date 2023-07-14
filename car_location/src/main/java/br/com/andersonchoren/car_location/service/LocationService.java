package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.LocationModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class LocationService implements IService<LocationModel>{
    @Override
    public LocationModel save(LocationModel object) {
        return null;
    }

    @Override
    public List<LocationModel> findAll() {
        return null;
    }

    @Override
    public Optional<LocationModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {

    }
}
