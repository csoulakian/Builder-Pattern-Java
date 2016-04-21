import java.util.ArrayList;
import java.util.Collections;

/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Concrete Builder
 */
public class FarhadsFavorite extends PizzaBuilder {

    public void buildCrust() {
        pizza.setCrust("thin");
    }

    public void buildSauce() {
        pizza.setSauce("normal marinara");
    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "mozzarella cheese", "sausage", "chicken", "tomato");
        pizza.setToppings(toppings);
    }

}