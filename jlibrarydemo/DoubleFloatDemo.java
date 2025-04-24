package jlibrarydemo;

public class DoubleFloatDemo {
    public static void main(String[] args) {
        Float valOneFloat = Float.valueOf(2.56f);
        Float valTwoFloat = Float.valueOf("2.57");

        int result = (int)(valOneFloat + valTwoFloat);

        System.out.println(result);

        System.out.println(Float.compare(valOneFloat, valTwoFloat));

        // valTwoFloat = 2.4f;

        System.out.println(valOneFloat.compareTo(2.4f));//autoboxing

        // Double vaDouble = valTwoFloat;//type-mismatch

        // auto-unboxing to float then float can be converted to a double without casting
        Double vaDouble = Double.valueOf(valTwoFloat);

        // it would be impossible without floatValue(), why?
        // Float.valueOf() is not applicable for type arguments of Double
        Float vFloat = Float.valueOf(vaDouble.floatValue());

        String fromFloat = Float.toString(vFloat);// auto-unboxing
        String floatString = vFloat.toString();

        System.out.println(fromFloat);
        System.out.println("By vFloat.toString(): " + floatString);
    }
}
