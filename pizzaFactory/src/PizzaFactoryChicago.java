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

        Cheese c = new Cheese();
        return c;
    }

    @Override
    public Sauce CreateSauce() {

        Sauce s = new Sauce();
        return s;
    }

        @Override
    public Pepperoni CreatePepperoni() {
        
        Pepperoni p = new Pepperoni();
        return p;
    }

    @Override
    public Veggies CreateVeggies() {
        
        Veggies v = new Veggies();
        return v;
    }
    
}
