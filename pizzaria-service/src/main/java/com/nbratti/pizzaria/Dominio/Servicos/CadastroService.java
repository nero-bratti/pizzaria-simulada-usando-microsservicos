package com.nbratti.pizzaria.Dominio.Servicos;

import com.nbratti.pizzaria.Dominio.Dados.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    private ClientesRepository clientesRepository;

    @Autowired
    public CadastroService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }
}
