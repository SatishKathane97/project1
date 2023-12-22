package basicprogram;

public class Reversingwords {
public static void main(String[] args) {
	String[] s1="Satish Ravi Manish Prakash".split(" ");
	String s2="";
	for(int i=s1.length-1;i>=0;i--) {
		s2+=s1[i]+ " ";
	}
	System.out.println(s2);
}
}
