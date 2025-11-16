package com.nbratti.pizzaria.Dominio.Dados;

import java.util.List;

import com.nbratti.pizzaria.Dominio.Entidades.CabecalhoCardapio;
import com.nbratti.pizzaria.Dominio.Entidades.Cardapio;
import com.nbratti.pizzaria.Dominio.Entidades.Produto;

public interface CardapioRepository {
    List<CabecalhoCardapio> cardapiosDisponiveis();
    Cardapio recuperaPorId(long id);
    List<Produto> indicacoesDoChef();
}
