package builder;

public class Pihvi implements Product {
    @Override
    public String name() {
        return "pihvi";
    }

    @Override
    public double price() {
        return 3.10;
    }
}
