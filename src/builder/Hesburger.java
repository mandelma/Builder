package builder;

import java.util.ArrayList;
import java.util.List;

public class Hesburger implements HampurilaisBuilder {
    List<Product> hampurilainen = new ArrayList<>();

    @Override
    public void getProduct() {
        hampurilainen.add(new Pulla());
        hampurilainen.add(new Pihvi());
        hampurilainen.add(new Salaatti());
        hampurilainen.add(new Kastike());
    }
    public List<Product> getBurger() {
        return hampurilainen;
    }
}
