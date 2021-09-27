package KeyWordslesson31;

public class SuperClassB extends SuperClassA {
    String name = "Anderson";

    public static void main(String[] args) {
        SuperClassB Good=new SuperClassB();
        Good.PrintName();

    }
    public void PrintName(){
        System.out.println("my teacher's name is" +name+ super.name);
    }
}
