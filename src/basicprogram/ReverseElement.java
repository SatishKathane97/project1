package basicprogram;

import java.util.Arrays;

public class ReverseElement {
public static void main(String[] args) {
	int[]a= {23,45,67,89,12,34,56,7,8,99};
	int i=0,j=a.length-1,temp;
	while(i<j) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(a));
	
}
}
