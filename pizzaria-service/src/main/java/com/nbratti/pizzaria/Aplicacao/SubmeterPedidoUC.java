package com.nbratti.pizzaria.Aplicacao;

import com.nbratti.pizzaria.Dominio.Servicos.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubmeterPedidoUC {
    private PedidoService service;

    @Autowired
    public SubmeterPedidoUC(PedidoService service) {
        this.service = service;
    }
}
