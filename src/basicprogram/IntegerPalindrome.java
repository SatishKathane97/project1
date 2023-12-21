package basicprogram;

import java.util.Scanner;

public class IntegerPalindrome {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int number=sc.nextInt();
	int rev=0;
	int temp=number;
	while(temp!=0) {
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(rev==number) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("It is not Palindrome");
	}
}
}
