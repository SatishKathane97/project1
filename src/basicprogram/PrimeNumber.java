package basicprogram;

public class PrimeNumber {
   public static void main(String[] args) {
	int n=27;
	int count=0;
	for(int i=2;i<n/2;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("It is Prime Number");
	}
	else {
		System.out.println("It is not Prime Number");
	}
}
}
