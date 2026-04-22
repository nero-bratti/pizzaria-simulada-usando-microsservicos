package nero.kitchen.pizza;

import java.util.List;
import java.util.Stack;

public class Pizza {
    public Dough dough;
    public Size size;
    public Sauce sauce;
    public Cheese cheese;
    public List<Topping> toppings;

    public Stack<PizzaComponent> ComponentOrder;

}
