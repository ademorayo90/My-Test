package Inheritance;

public class ChildClassB extends ParentClassA{
    public static void main(String[] args) {
        String bag ;
        String Bank ;
        String Lottery ;
        String Health;
        String Life ;

        System.out.println("bag");
        System.out.println("Bank");
        System.out.println("Lottery");
        System.out.println("Health");
        System.out.println("Life");






        ChildClassB gives = new ChildClassB();
        gives.moneyBag();
        ChildClassB Takes = new ChildClassB();
        Takes.moneyBank();
        ChildClassB Collect = new ChildClassB();
        Collect.moneyLottery();
        ChildClassB Have = new ChildClassB();
        Have.goodHealth();
        ChildClassB set = new ChildClassB();
        set.goodLife();
    }


    public void goodHealth() {

    }
    public void goodLife() {
    }
}
