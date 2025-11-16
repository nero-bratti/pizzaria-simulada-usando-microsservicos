package com.nbratti.pizzaria.Dominio.Servicos;

import com.nbratti.pizzaria.Dominio.Servicos.Interfaces.IPagamentoService;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService implements IPagamentoService {
    public boolean efetuarPagamento(int id) {
        return true;
    }
}
