package com.nbratti.pizzaria.Dominio.Servicos;

import com.nbratti.pizzaria.Dominio.Dados.IngredientesRepository;
import com.nbratti.pizzaria.Dominio.Entidades.ItemEstoque;
import com.nbratti.pizzaria.Dominio.Servicos.Interfaces.IEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService implements IEstoqueService {
     private IngredientesRepository ingredientesRepository;

     @Autowired
     public EstoqueService(IngredientesRepository ingredientesRepository) {
        this.ingredientesRepository = ingredientesRepository;
     }

     public boolean temEstoque(ItemEstoque item) {
        return true;
     }
}
