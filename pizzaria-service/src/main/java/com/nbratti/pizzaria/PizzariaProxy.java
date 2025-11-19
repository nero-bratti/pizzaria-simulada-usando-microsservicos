package com.nbratti.pizzaria;

import com.nbratti.pizzaria.Dominio.Entidades.ItemPedido;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pizzaria")
public interface PizzariaProxy {
    @GetMapping("/pizzaria/from/{from}/to/{to}")
    public ItemPedido itemPedido(@PathVariable String from, @PathVariable String to);
}
