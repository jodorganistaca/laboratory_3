public class Decaf extends Beverage{
    public Decaf(){
        this.description = "A decaf coffee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
