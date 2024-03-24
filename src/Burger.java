public class Burger {

    public String bun;
    public String meat;
    public String cheese;
    public String greens;
    public String mayonnaise;



    public Burger (String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }


    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }

    public Burger ordinaryBurger (String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        return null;


    }


}
