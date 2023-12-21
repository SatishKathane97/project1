package basicprogram;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Element");
	String s1=sc.next();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2+=s1.charAt(i);
	}
	System.out.println(s2);
	
}
}
