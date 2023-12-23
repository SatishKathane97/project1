package basicprogram;

public class BoubbleSort {
public static void main(String[] args) {
	int[]a= {2,45,6,7,89,12,13,55};
	for(int i=0;i<a.length-1;i++) {
		for(int j=1;j<a.length-i;j++) {
			if(a[j-1]>a[j]) {
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	for (int i : a) {
		System.out.print(i + " ");
	}
}
}
