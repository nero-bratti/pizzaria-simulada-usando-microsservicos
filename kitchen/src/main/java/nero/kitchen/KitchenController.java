package nero.kitchen;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitchenController {

    @GetMapping
    @CrossOrigin("*")
    public String welcomeMessage() {
        return "Hello. Welcome";
    }
}
