import java.text.DecimalFormat;

public class Hamburger {
    private String name;
    private String meat;
    protected  double basePrice;
    private String breadRollType;

    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    protected String addition3Name;
    protected double addition3Price;
    protected String addition4Name;
    protected double addition4Price;





    public Hamburger(String name, String meat, double basePrice, String breadRollType) {
        if (this instanceof DeluxeBurger) System.out.println("Cannot not add additional items to a deluxe burger");
        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f\n",name, breadRollType, meat, basePrice);
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        System.out.printf("Add %s for an extra %.2f\n", name, price);
        this.addition1Name = name;
        this.addition1Price = price;

    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.printf("Add %s for an extra %.2f\n", name, price);
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.printf("Add %s for an extra %.2f\n", name, price);
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.printf("Add %s for an extra %.2f\n", name, price);
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = basePrice +
                ((addition1Name != null) ? addition1Price : 0) +
                ((addition2Name != null) ? addition2Price : 0) +
                ((addition3Name != null) ? addition3Price : 0) +
                ((addition4Name != null) ? addition4Price : 0);
        totalPrice = (double) Math.round(totalPrice * 100) / 100.0;
//        DecimalFormat df = new DecimalFormat();
//        df.set;
//        String ans = df.format(totalPrice);
        return totalPrice;





    }


}
