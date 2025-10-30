public class PizzaFactoryChicago implements PizzaIngredientFactory {

    @Override
    public Clam CreateClam() {

        Clam c = new Clam();
        return c;
    }

    @Override
    public Dough createDough() {

        Dough d = new Dough();
        return d;
    }

    @Override
    public Cheese CreateCheese() {
        return null;
    }

    @Override
    public Sauce CreateSauce() {
        return null;
    }
}
