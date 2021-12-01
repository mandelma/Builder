package builder;


public class Tilaus {
    public static void main(String[] args) {
        double hinta = 0;
        Ravintola ravintola = new Ravintola();

        System.out.println("Hesburger hampurilainen koostuu:");

        Hesburger hesburgerBuilder = new Hesburger();
        ravintola.valmistaHampurilainen(hesburgerBuilder);

        for(Product meal : ravintola.hesburger()) {
            System.out.println(meal.name());
            hinta += meal.price();
        }
        System.out.println("Hinta: " + hinta + " euroa.");

        System.out.println("----------------------------");

        System.out.println("McDonalds hampurilainen koostuu:");

        McDonalds mcDonaldsBuilder = new McDonalds();
        ravintola.valmistaHampurilainen(mcDonaldsBuilder);
        String burger = ravintola.mcDonalds().toString();

        System.out.println(burger + "\n" + "Hinta: samaa.");
    }
}
