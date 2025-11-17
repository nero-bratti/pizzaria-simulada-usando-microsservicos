package com.nbratti.pizzaria.Adaptadores.Apresentacao;

import com.nbratti.pizzaria.Aplicacao.AutenticarClienteUC;
import com.nbratti.pizzaria.Aplicacao.RegistrarClienteUC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private RegistrarClienteUC registrarClienteUC;
    private AutenticarClienteUC autenticarClienteUC;

    public ClienteController(RegistrarClienteUC registrarClienteUC, AutenticarClienteUC autenticarClienteUC) {
        this.registrarClienteUC = registrarClienteUC;
        this.autenticarClienteUC = autenticarClienteUC;
    }


}
