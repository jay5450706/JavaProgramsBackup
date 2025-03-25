package mypackage;

public class StaticDemo {

    static int variable;
    int instanceVar;

    StaticDemo(){
        variable = 5; //constructor can access static variables
        System.out.println(variable);
    }

    public void getVariable(){
        variable = 20;
        System.out.println(variable);
    }

    public static void modifyVar(){
        variable = 50;
        new StaticDemo().instanceVar = 500;
    }
}
