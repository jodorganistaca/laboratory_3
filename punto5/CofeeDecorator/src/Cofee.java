public class Cofee extends Beverage {

    public Cofee(){
        this.description = "Just a coffee";
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return .75;
    }
}
