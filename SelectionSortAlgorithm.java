package Algorithms;
import java.util.Scanner;

public class SelectionSortAlgorithm {
	
	public static void selectionSort(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min])
					min=j;
			}
		 int temp=a[min];
		 a[min]=a[i];
		 a[i]=temp;
		}
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
       selectionSort(a,n);
       System.out.print("After Sorting the Array: ");
       for(int i=0;i<n;i++) {
    	   System.out.print(a[i]+" ");
       }
	}

}
