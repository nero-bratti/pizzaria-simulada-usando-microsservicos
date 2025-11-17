package com.nbratti.pizzaria.Dominio.Dados;

import java.util.List;

import com.nbratti.pizzaria.Dominio.Entidades.Produto;

public interface ProdutosRepository {
    Produto recuperaProdutoPorid(long id);
    List<Produto> recuperaProdutosCardapio(long id);
}
