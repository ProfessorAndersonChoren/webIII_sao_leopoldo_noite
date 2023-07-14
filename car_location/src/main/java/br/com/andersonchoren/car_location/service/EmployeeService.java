package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.EmployeeModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeService implements IService<EmployeeModel>{
    @Override
    public EmployeeModel save(EmployeeModel object) {
        return null;
    }

    @Override
    public List<EmployeeModel> findAll() {
        return null;
    }

    @Override
    public Optional<EmployeeModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {

    }
}
