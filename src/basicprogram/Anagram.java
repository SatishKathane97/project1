package basicprogram;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="SILENT";
	String s2="LISTEN";
	char[]c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	if(c1.length !=c2.length) {
		System.out.println("It is Not anagram");
		System.exit(0);
		
	}
	Arrays.sort(c1);
	Arrays.sort(c2);
	for(int i=0;i<s1.length();i++) {
		if(c1.length !=c2.length) {
			System.out.println("It is not Anagram");
			System.exit(0);
		}
	}
	System.out.println("It is Anagram");
}
}
