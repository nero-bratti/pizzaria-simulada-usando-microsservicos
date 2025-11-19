package nbratti.estoque;

import org.springframework.data.repository.CrudRepository;

interface EstoqueRepository extends CrudRepository<Estoque,Long> {
    Estoque findByFromAndTo(String from, String to);
}