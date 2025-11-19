package nbratti.estoque;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

public class EstoqueController {
    private final EstoqueProxy proxy;
    private RabbitTemplate rabbitTemplate;
    private FanoutExchange fanout;
    public EstoqueController(EstoqueProxy proxy, RabbitTemplate template, FanoutExchange fanout) {
        this.proxy = proxy; this.rabbitTemplate = template;
        this.fanout = fanout;
    }
    @GetMapping("/estoque-feign/from/{from}/to/{to}/quantity/{quantity}")
    public Estoque entregasFeign(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity) {
        Estoque entregas = proxy.retrieveExchangeValue(from,to);
        HistoryDTO dto = new HistoryDTO(from, to);
        rabbitTemplate.convertAndSend(fanout.getName(),"",dto);
        return new Estoque(entregas.getId(), from, to,
                quantity, entregas.getConversionMultiple(),
                quantity.multiply(entregas.getConversionMultiple()),
                entregas.getEnvironment() + " " + "feign");
    }
}