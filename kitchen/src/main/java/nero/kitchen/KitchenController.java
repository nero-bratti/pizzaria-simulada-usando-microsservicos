package nero.kitchen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {
    @GetMapping("/menu")
    public String getMenu() {
        return "Available pizzas: Margherita, Pepperoni, Four Cheese, Hawaiian";
    }

    @GetMapping("/pizza/{pizzaName}")
    public String getPizzaTypeByName(@PathVariable String pizzaName) {
        return "Details for " + pizzaName + " pizza:";
    }

    @PostMapping("/order")
    public String createOrder(@RequestBody String pizzaName) {
        return "Order received: A " + pizzaName + " pizza will be prepared.";
    }
}