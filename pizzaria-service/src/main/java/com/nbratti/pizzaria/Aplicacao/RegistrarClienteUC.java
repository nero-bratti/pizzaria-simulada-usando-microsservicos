package com.nbratti.pizzaria.Aplicacao;

import com.nbratti.pizzaria.Dominio.Servicos.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrarClienteUC {
    private CadastroService cadastroService;

    @Autowired
    public RegistrarClienteUC(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }
}
