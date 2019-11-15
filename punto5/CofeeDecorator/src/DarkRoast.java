public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "A dark roast coffee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return .99;
    }
}