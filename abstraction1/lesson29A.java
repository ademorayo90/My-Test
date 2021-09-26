package AbstractionLesson29A;

public  abstract class ClassA {
    public abstract void username();
    public abstract void password ();
    public abstract void forgot ();
    public void Remember(){
        System.out.println("Remember me always") ;


    }
    public void Homepage(){
        System.out.println("I should access homepage");
    }
    public void OAuth(){
        System.out.println("Library this OAuth");
    }
}
