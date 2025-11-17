package com.nbratti.pizzaria.Aplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nbratti.pizzaria.Aplicacao.Responses.CabecalhoCardapioResponse;
import com.nbratti.pizzaria.Dominio.Servicos.CardapioService;

@Component
public class RecuperaListaCardapiosUC {
    private CardapioService cardapioService;

    @Autowired
    public RecuperaListaCardapiosUC(CardapioService cardapioService){
        this.cardapioService = cardapioService;
    }

    public CabecalhoCardapioResponse run(){
        return new CabecalhoCardapioResponse(cardapioService.recuperaListaDeCardapios());
    }    
}
