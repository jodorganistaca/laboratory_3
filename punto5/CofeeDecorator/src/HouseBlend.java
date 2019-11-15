public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "A house blend cofee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 1;
    }
}
