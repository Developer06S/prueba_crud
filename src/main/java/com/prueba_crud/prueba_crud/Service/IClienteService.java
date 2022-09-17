package com.prueba_crud.prueba_crud.Service;

import com.prueba_crud.prueba_crud.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IClienteService  {
    List<Cliente> findAll();

    Optional<Cliente> findByID(Integer id);

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    void delete(Integer id);
}
