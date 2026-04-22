package nero.kitchen;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class KitchenControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnMenu() throws Exception {
        mockMvc.perform(get("/kitchen/menu"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("pizza")));
    }

    @Test
    void shouldReturnPizzaDetails() throws Exception {
        mockMvc.perform(get("/kitchen/pizza/margherita"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("margherita")));
    }
}