package com.nbratti.pizzaria.Dominio.Servicos;

import org.springframework.stereotype.Service;

@Service
public class ImpostosService {

    private final String nome;
    private final double valor;

    private ImpostosService(Builder builder) {
        this.nome = builder.nome;
        this.valor = builder.valor;
    }

    public static class Builder {
        private String nome;
        private double valor;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder valor(double valor) {
            this.valor = valor;
            return this;
        }

        public ImpostosService build() {
            return new ImpostosService(this);
        }
    }
}