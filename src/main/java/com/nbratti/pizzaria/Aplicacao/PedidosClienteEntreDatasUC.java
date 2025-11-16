package com.nbratti.pizzaria.Aplicacao;

import com.nbratti.pizzaria.Dominio.Servicos.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidosClienteEntreDatasUC {
    private PedidoService pedidoService;

    @Autowired
    public PedidosClienteEntreDatasUC(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
}