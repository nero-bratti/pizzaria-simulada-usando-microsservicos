package com.nbratti.pizzaria.Dominio.Dados;

import com.nbratti.pizzaria.Dominio.Entidades.Receita;

public interface ReceitasRepository {
    Receita recuperaReceita(long id);
    
}
