package anotherpackage;

public class GenericMethodRef {
    static <T> int myOp(MyFunction<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Vals contains " + count + " 4s");
        
        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("strs contains " + count + " Twos");
        
        //Remember: when you create an object you can access its methods and instance
        //variables
        
        MyFunction<Integer> vr = MyArrayOps::countMatching;
        count = vr.func(vals, 2);
        System.out.println("Vals contains " + count + " 2s");
    }
}
