package com.nbratti.pizzaria.Dominio.Servicos.Interfaces;

import com.nbratti.pizzaria.Dominio.Entidades.ItemEstoque;

public interface IEstoqueService {
    boolean temEstoque(ItemEstoque item);
}
