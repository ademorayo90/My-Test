package introTOOPP;

public class ClassA2 {
    String school;
    int books;
    boolean gift;
    public ClassA2(String schools) {
        school = schools;
    }
    public ClassA2(String schools,int book) {
        books = book;
    }
    public ClassA2(String schools,int book,boolean gifts) {
        gift = gifts;
    }
    public void printClassA2 () {
        System.out.println(school);

    }
}
