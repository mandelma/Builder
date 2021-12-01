package builder;

public class Pulla implements Product {
    @Override
    public String name() {
        return "pulla";
    }

    @Override
    public double price() {
        return 1.2;
    }
}
