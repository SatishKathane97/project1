package basicprogram;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Element");
	String s1=sc.next();
	String rev="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	if(s1.equals(rev)) {
		System.out.println("String is Palindrome");
	}
	else {
		System.out.println("String not Palindrome");
	}
}
}
