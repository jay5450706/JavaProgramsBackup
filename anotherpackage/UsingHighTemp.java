package anotherpackage;

public class UsingHighTemp {
    public static void main(String[] args) {
        HighTemp temp1 = new HighTemp(24), 
        temp2 = new HighTemp(25),
        temp3 = new HighTemp(24);
        

        if(temp1.sameTemp(temp2)){
            System.out.println("temp1 == temp2");
        }else{
            System.out.println("temp1 != temp2");
        }

        if(temp1.lessThanTemp(temp2)){
            System.out.println("temp1 < temp2");
        }

        if(temp1.sameTemp(temp3)){
            System.out.println("temp1 == temp3");
        }

        MyFunc<HighTemp> ht = (t,v) -> {
            return t.sameTemp(v);
        };

        if(ht.func(temp2, temp3)){
            System.out.println("temp2 == temp3");
        }



    }

    static void compare(MyFunc<HighTemp> f, HighTemp v){
       
    }


}
