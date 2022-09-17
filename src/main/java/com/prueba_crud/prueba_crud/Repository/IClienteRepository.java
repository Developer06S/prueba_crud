package com.prueba_crud.prueba_crud.Repository;

import com.prueba_crud.prueba_crud.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
