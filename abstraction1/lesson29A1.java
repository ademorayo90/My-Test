package AbstractionLesson29A;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassB company = new ClassB();
        company.forgot();
        company.password();
        company.username();
        company.Homepage();
        company.Remember();
        company.OAuth();


    }

    @Override
    public void username() {
        System.out.println("I should username");
    }

    @Override
    public void password() {
        System.out.println("I should password always");
    }

    @Override
    public void forgot() {

    }
}
