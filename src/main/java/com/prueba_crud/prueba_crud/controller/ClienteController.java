package com.prueba_crud.prueba_crud.controller;

import com.prueba_crud.prueba_crud.Service.ClienteService;
import com.prueba_crud.prueba_crud.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());

    }

    /* Busca un cliente por su id*/
    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente) {
        return clienteService.findByID(idCliente)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /* Crea un cliente nuevo*/
    @PostMapping
    public ResponseEntity<Cliente> created(@Valid @RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);

    }

    /* Actualizar un cliente nuevo*/
    @PutMapping
    public ResponseEntity<Cliente> update (@Valid @RequestBody Cliente cliente) {
        return clienteService.findByID(cliente.getIdCliente())
                .map(c -> ResponseEntity.ok(clienteService.update(cliente)))
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    /* Eliminar un cliente*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idCliente) {
        return clienteService.findByID(idCliente)
                .map(c -> {
                    clienteService.delete(idCliente);
                    return ResponseEntity.ok().build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
