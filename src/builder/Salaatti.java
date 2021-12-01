package builder;

public class Salaatti implements Product{
    @Override
    public String name() {
        return "Jäävuorisalaatti";
    }

    @Override
    public double price() {
        return 0.2;
    }
}
