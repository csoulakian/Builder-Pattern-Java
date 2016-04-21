/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Client with main method
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        System.out.println("Waiter: What kind of pizza would you like?");

        PizzaBuilder chrissyFavePizzaBuilder = new ChrissysFavorite();
        PizzaBuilder farhadFavePizzaBuilder = new FarhadsFavorite();
        PizzaBuilder hotPepperoniPizzaBuilder = new HotPepperoni();
        PizzaBuilder meatLoversPizzaBuilder = new MeatLovers();

        System.out.println("Chrissy: I would like one of Chrissy's Favorites and a Meat Lovers pizza.");
        System.out.println("Farhad: I'll have one of Farhad's Favorites and a Hot Pepperoni pizza.");

        System.out.println("\n**** 20 minutes later ****");

        waiter.setPizzaBuilder(chrissyFavePizzaBuilder);
        waiter.constructPizza();
        Pizza pizza1 = waiter.getPizza();
        System.out.println("\nHere is Chrissy's Favorite pizza:\n- crust: " + pizza1.getCrust() +
                "\n- sauce: " + pizza1.getSauce() + "\n- toppings: " + pizza1.getToppings());

        waiter.setPizzaBuilder(meatLoversPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza2 = waiter.getPizza();
        System.out.println("\nThe Meat Lovers pizza:\n- crust: " + pizza2.getCrust() +
                "\n- sauce: " + pizza2.getSauce() + "\n- toppings: " + pizza2.getToppings());

        waiter.setPizzaBuilder(farhadFavePizzaBuilder);
        waiter.constructPizza();
        Pizza pizza3 = waiter.getPizza();
        System.out.println("\nHere is Farhad's Favorite pizza:\n- crust: " + pizza3.getCrust() +
                "\n- sauce: " + pizza3.getSauce() + "\n- toppings: " + pizza3.getToppings());

        waiter.setPizzaBuilder(hotPepperoniPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza4 = waiter.getPizza();
        System.out.println("\nAnd the Hot Pepperoni pizza:\n- crust: " + pizza4.getCrust() +
                "\n- sauce: " + pizza4.getSauce() + "\n- toppings: " + pizza4.getToppings());

    }
}
