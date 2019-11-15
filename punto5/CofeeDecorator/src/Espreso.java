public class Espreso extends Beverage {
    public Espreso(){
        this.description = "A espreso coffee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
