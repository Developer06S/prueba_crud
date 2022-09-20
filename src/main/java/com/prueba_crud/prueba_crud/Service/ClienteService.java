package com.prueba_crud.prueba_crud.Service;


import com.prueba_crud.prueba_crud.Repository.IClienteRepository;
import com.prueba_crud.prueba_crud.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

   @Autowired
   private IClienteRepository clienteRepository;


    @Override
   public List<Cliente> findAll() {
      return clienteRepository.findAll();
   }

   @Override
   public Optional<Cliente> findByID(Integer id) {
      return clienteRepository.findById(id);
   }

   @Override
   public Cliente create(Cliente cliente) {
      return clienteRepository.save(cliente);
   }

   @Override
   public Cliente update(Cliente cliente) {
      return clienteRepository.save(cliente);
   }

   @Override
   public void delete(Integer id) {
      {
         clienteRepository.deleteById(id);
      }
   }
}
