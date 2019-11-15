public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.9;
    }
}
