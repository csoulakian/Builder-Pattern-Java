import java.util.ArrayList;
import java.util.Collections;

/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Concrete Builder
 */
public class HotPepperoni extends PizzaBuilder {

    public void buildCrust() {
        pizza.setCrust("red pepper");
    }

    public void buildSauce() {
        pizza.setSauce("hot marinara");
    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "pepperoni", "jalapeno peppers");
        pizza.setToppings(toppings);
    }

}
