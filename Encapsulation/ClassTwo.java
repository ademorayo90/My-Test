package introTOOPP;

import introTOOPP.ClassA2;

public class ClassTwo {
    public static void main(String[] args) {
        ClassA2 box = new ClassA2();
        int length = box.getLength();
        System.out.println(length);
        int breadth = box.getBreadth();
        System.out.println(breadth);
        int area = breadth * length;
        System.out.println(area);
    }
}
