package anotherpackage;

public class CustomException extends Exception{
    private int detail;

    CustomException(int a){
        super("Demo Message");
        detail = a;
    }

public String toString(){
    return "MyException[" + detail + "]";
}

public int getDetail(){
    return detail;
}
    
}
