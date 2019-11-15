public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with soy milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
