package builder;

import java.util.List;

public class McDonalds implements HampurilaisBuilder {

    final StringBuilder hampurilainen = new StringBuilder();

    @Override
    public void getProduct() {
        String pulla = new Pulla().name();
        String pihvi = new Pihvi().name();
        String salaatti = new Salaatti().name();
        String kastike = new Kastike().name();

        hampurilainen.append(pulla).append("\n");
        hampurilainen.append(pihvi).append("\n");
        hampurilainen.append(salaatti).append("\n");
        hampurilainen.append(kastike);
    }

    public StringBuilder getBurger() {
        return hampurilainen;
    }
}
