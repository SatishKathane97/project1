package basicprogram;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int result=0;
	int temp=n;
	while(temp!=0) {
		int rem=temp%10;
		result+=Math.pow(rem, 3);
		temp/=10;
	}
	if(result==n) {
		System.out.println("It is Armstrong number");
	}
	else {
		System.out.println("It is not Armstrong number");
	}
}
}
