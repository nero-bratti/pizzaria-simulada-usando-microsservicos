package nbratti.entregas;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "entregas")
public interface EntregasProxy {
    @GetMapping("/entregas/from/{from}/to/{to}")
    public Entregas entregas(@PathVariable String from, @PathVariable String to);

    Entregas retrieveExchangeValue(String from, String to);
}
