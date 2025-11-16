package com.nbratti.pizzaria.Aplicacao;

import com.nbratti.pizzaria.Dominio.Servicos.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutenticarClienteUC {
    private AutenticacaoService autenticacaoService;

    @Autowired
    public AutenticarClienteUC(AutenticacaoService autenticacaoService) {
        this.autenticacaoService = autenticacaoService;
    }
}
