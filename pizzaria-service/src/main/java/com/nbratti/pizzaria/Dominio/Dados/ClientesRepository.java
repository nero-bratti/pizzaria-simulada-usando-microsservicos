package com.nbratti.pizzaria.Dominio.Dados;

import com.nbratti.pizzaria.Dominio.Entidades.Cliente;

import java.util.Optional;

public interface ClientesRepository {
    Cliente findByEmail(String email);
    void save(Cliente cliente);
}
