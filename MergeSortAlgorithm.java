package Algorithms;
import java.util.*;

public class MergeSortAlgorithm
{
    public static void merge(int a[],int l,int mid,int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int b[]=new int[n1];
        int c[]=new int[n2];
        for(int i=0;i<n1;i++){
            b[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            c[j]=a[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(b[i]<=c[j]){
                a[k]=b[i];
                i++;
            }
            else{
                a[k]=c[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=b[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=c[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int a[],int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Size of Array: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter the Elements of Array: ");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	System.out.print("Before Sorting the Array: ");
	for(int i=0;i<n;i++){
	    System.out.print(a[i]+" "); 
	}
	mergeSort(a,0,n-1);
	System.out.println();
	System.out.print("After Sorting the Array: ");
	for(int i=0;i<n;i++){
	    System.out.print(a[i]+" ");
	}
	}
}