package com.prueba_crud.prueba_crud.Service;


import com.prueba_crud.prueba_crud.Repository.IClienteRepository;
import com.prueba_crud.prueba_crud.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
   @Autowired
   private IClienteRepository clienteRepository;


   public ClienteService(IClienteRepository clienteRepository) {
      this.clienteRepository = clienteRepository;
   }


   @Override
   public List<Cliente> findAll() {
      return null;
   }

   @Override
   public Optional<Cliente> findByID(Integer id) {
      return Optional.empty();
   }

   @Override
   public Cliente create(Cliente cliente) {
      return null;
   }

   @Override
   public Cliente update(Cliente cliente) {
      return null;
   }

   @Override
   public void delete(Integer id) {

   }
}
