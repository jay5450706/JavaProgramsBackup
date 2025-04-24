/*
 *Demonstrating if we can have an assignment statement where condition is expected
 *
 *Result: int cannot be converted to a boolean
 *
 *Also this program tests the order of expression evaluation.
 */

package jpackage;

public class Test {
	public static void main(String[] args){
		int a = 5;
		int b;

		//while(a = 7){
		//	System.out.println("Inside while loop one: " + a);
		//	break;
		//}

		//while(a){
		//	System.out.println("Inside while loop two: " + a);
		//	break;
		//}

		a = 5;
		int c = (b = a + 2) - (a = 1);

		System.out.println("a = " + a + " b = " + b + " c = " + c);

		int i = 2;
		int j = i * i++;

		System.out.println("i = " + i + " j = " + j);

		int d = 1;
		int e = d = 2;
		//int f = int g = 2;//Variable declaration is a statement not an expression.

		System.out.println("d = " + d + " e = " + e);

		int m = 12, n = 13;
		System.out.println("m is: " + m + " n is: " + n);

		printValues(m = 15, n = 16);

		System.out.println("m is: " + m + " n is: " + n);
	}

	public static void printValues(int m, int n){
		System.out.println("m is: " + m + " n is: " + n);
	}
}