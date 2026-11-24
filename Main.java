import java.util.*;
public class Main {
 static int partition(int[] a,int low,int high){int pivot=a[high],i=low-1;for(int j=low;j<high;j++)if(a[j]<=pivot){i++;int temp=a[i];a[i]=a[j];a[j]=temp;}int temp=a[i+1];a[i+1]=a[high];a[high]=temp;return i+1;}
 static void quickSort(int[] a,int low,int high){while(low<high){int p=partition(a,low,high);if(p-low<high-p){quickSort(a,low,p-1);low=p+1;}else{quickSort(a,p+1,high);high=p-1;}}}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid input.");return;}int[] a=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)a[i]=sc.nextInt();quickSort(a,0,n-1);System.out.println("Sorted array: "+Arrays.toString(a));}
}
