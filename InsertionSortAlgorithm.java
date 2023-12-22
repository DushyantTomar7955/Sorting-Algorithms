package Algorithms;
import java.util.Scanner;

public class InsertionSortAlgorithm {
	
	public static void insertionSort(int a[],int n) {
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key=a[i];
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
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
       insertionSort(a,n);
       System.out.print("After Sorting the Array: ");
       for(int i=0;i<n;i++) {
    	   System.out.print(a[i]+" ");
       }

    }
}
