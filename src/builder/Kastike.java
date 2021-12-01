package builder;

public class Kastike implements Product {
    @Override
    public String name() {
        return "kastike";
    }

    @Override
    public double price() {
        return 0.5;
    }
}
