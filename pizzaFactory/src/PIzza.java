public abstract class PIzza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clcam;

    abstract void prepare();

    void bake() {

        System.out.println("Assar por 25 minutos a 350º!");
    }

    void cut() {

        System.out.println("Cortar pizza!");
    }

    void box() {

        System.out.println("Colocar pizza na caixa!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PIzza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + veggies + ", cheese="
                + cheese + ", pepperoni=" + pepperoni + ", clcam=" + clcam + "]";
    }

}
