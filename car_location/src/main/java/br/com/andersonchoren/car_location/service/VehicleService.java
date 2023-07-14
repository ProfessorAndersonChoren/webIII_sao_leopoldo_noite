package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.VehicleModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class VehicleService implements IService<VehicleModel>{
    @Override
    public VehicleModel save(VehicleModel object) {
        return null;
    }

    @Override
    public List<VehicleModel> findAll() {
        return null;
    }

    @Override
    public Optional<VehicleModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {

    }
}
