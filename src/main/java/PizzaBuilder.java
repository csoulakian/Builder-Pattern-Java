/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Abstract Builder
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildCrust();

    public abstract void buildSauce();

    public abstract void buildToppings();
}
