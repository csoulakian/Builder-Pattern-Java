import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Concrete Builder
 */
public class ChrissysFavorite extends PizzaBuilder {

    public void buildCrust() {
        pizza.setCrust("regular");
    }

    public void buildSauce() {
        pizza.setSauce("normal marinara");
    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "cheese", "green peppers", "chicken");
        pizza.setToppings(toppings);
    }

}
