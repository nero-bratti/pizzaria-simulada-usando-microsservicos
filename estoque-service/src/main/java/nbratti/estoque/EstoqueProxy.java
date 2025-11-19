package nbratti.estoque;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "entregas")
public interface EstoqueProxy {
    @GetMapping("/entregas/from/{from}/to/{to}")
    public Estoque estoque(@PathVariable String from, @PathVariable String to);

    Estoque retrieveExchangeValue(String from, String to);
}
