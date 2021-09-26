package Interfaces;

public class ClassB implements ClassA{

    public static void main(String[] args) {
        ClassB company =new ClassB();
        company.login();
        company.homepage();

    }




    @Override
    public void login () {
        System.out.println("correct username should be enter to login");

    }

    @Override
    public void homepage () {
        System.out.println("correct password should be used to access homepage");

    }
}
