public class Main {

    public static void main(String[] args) {
        Beverage simple = new Cofee();
        System.out.println("Simple: "+simple.getDescription());

        Beverage elementary = new Milk(new Cofee());
        System.out.println("Elementary: " + elementary.getDescription());

        Beverage sophisticated = new Hot(new Cofee());
        System.out.println("Sophisticated: "+sophisticated.getDescription());

        Beverage basic = new Warm(new Cofee());
        System.out.println("Basic: "+basic.getDescription());

        Beverage advanced = new Figure(new Mocha(new Milk(new Cofee())));
        System.out.println("Advanced: "+advanced.getDescription());
    }
}
