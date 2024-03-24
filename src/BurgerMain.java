public class BurgerMain {

    public static void main (String[] args){
       Burger burger = new Burger();
       Burger burger1 = new Burger(burger.bun, burger.meat, burger.cheese, burger.greens, burger.mayonnaise);
       Burger burger2 = new Burger(burger1.bun, burger1.meat, burger1.cheese, burger1.greens);
       Burger burger3 = new Burger(burger2.bun, burger2.meat, burger2.cheese, burger2.greens, burger2.mayonnaise, burger2.meatCount);







    }
}
