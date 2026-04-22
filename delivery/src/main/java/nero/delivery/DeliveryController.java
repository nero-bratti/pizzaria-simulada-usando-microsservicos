package nero.delivery;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @GetMapping("/status/{orderId}")
    public String getDeliveryStatus(@PathVariable String orderId) {
        return "Delivery for order " + orderId + " is being processed.";
    }

    @PostMapping("/assign")
    public String assignDelivery(@RequestBody String orderId) {
        return "Delivery person assigned to order " + orderId;
    }

    @GetMapping("/driver/{driverId}")
    public String getDriverInfo(@PathVariable String driverId) {
        return "Driver " + driverId + " is currently on a route.";
    }
}