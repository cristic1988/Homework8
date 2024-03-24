public class Burger {

    public String bun;
    public String meat;
    public String cheese;
    public String greens;
    public String mayonnaise;
    public int meatCount;

    public Burger() {


    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", meatCount=" + meatCount +
                '}';
    }


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, int meatCount) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        if (meatCount == 2) {

        } else {
            System.out.println("Склад бургера з подвійним м'ясом: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);

        }
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens);

    }


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);

    }

}