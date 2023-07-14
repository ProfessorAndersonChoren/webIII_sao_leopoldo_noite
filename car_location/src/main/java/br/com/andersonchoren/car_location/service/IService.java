package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.ClientModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IService<E> {
    E save(E object);
    List<E> findAll();
    Optional<E> findById(UUID id);
    void delete(UUID id);
}
