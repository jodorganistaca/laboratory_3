public class Hot extends CondimentDecorator {
    public Hot(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and cook time > 2 minutes";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
