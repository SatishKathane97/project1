package basicprogram;

public class BinarySearch {
public static void main(String[] args) {
	int[]a= {34,56,78,12,45,67,89,23};
	int li=0;
	int hi=a.length;
	int mid=(li+hi)/2;
	int search=45;
	while(li<=hi) {
		if(a[mid]==search) {
			System.out.println("Element at " + mid+"index");
			break;
			}
		else if(a[mid]<search){
			li=mid+1;
		}
		else {
			hi=mid-1;
		}
	}
	mid=(li+hi)/2;
	if(li>hi) {
		System.out.println("Element not present");
	}
}
}
