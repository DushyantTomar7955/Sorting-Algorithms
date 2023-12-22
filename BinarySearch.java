package Algorithms;
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int a[],int n,int key) {
		int l=0;
		int h=n-1;
		while(l<=h) {
			int mid=l+((h-l)/2);
			if(key==a[mid])
				return mid;
			else if(key<mid)
				h=mid-1;
			else 
				l=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
					System.out.print("Enter the Size of Array: ");
					int n=sc.nextInt();
					System.out.print("Enter the Array Elements: ");
					int a[]=new int[n];
					for(int i=0;i<n;i++){
					    a[i]=sc.nextInt();
					}
					System.out.print("Enter the Key to be Searched: ");
					int key=sc.nextInt();
					int index=binarySearch(a,n,key);
					if(index==-1)
						System.err.println("Key is not Found...");
					else
						System.out.println("Key is Found At index: "+index);

	}

}
