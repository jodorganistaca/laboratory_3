public class Figure extends CondimentDecorator{

    public Figure(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and a figure in the cover";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.02;
    }
}
