package Polymorphism;



public class OverridingChild extends OverridingParent{
    public static void main(String[] args) {
        OverridingChild favour = new OverridingChild();
        favour.Housework(4,true);
    }


        public void Housework(int type,boolean condition) {
            //System.out.println("father engages in chores");
            System.out.println("favour engages in chores");
        }

        }


