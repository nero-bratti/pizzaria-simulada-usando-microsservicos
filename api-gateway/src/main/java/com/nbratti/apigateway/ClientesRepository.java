package com.nbratti.apigateway;

public interface ClientesRepository {
    Cliente findByEmail(String email);
    void save(Cliente cliente);
}
