package com.nbratti.pizzaria.Dominio.Servicos;

import com.nbratti.pizzaria.Dominio.Dados.EntregasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaService {
    private EntregasRepository EntregasRepository;

    @Autowired
    public EntregaService(com.nbratti.pizzaria.Dominio.Dados.EntregasRepository entregasRepository) {
        EntregasRepository = entregasRepository;
    }

    boolean entregar(long id) {
        return true;
    }
}
