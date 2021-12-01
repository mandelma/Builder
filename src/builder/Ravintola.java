package builder;

import java.util.List;

public class Ravintola {
    private HampurilaisBuilder builder;

    public void valmistaHampurilainen(HampurilaisBuilder hb) {
        this.builder = hb;
    }

    public List<Product> hesburger() {
        builder.getProduct();

        return (List) builder.getBurger();
    }

    public StringBuilder mcDonalds() {
        builder.getProduct();

        return (StringBuilder) builder.getBurger();
    }




}
