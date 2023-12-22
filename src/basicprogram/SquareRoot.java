package basicprogram;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	double n=sc.nextDouble();
	double result;
	result=Math.sqrt(n);
	System.out.println("The Square of the " + n +":"+ result);
	
		}
}
