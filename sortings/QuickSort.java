import java.util.Scanner;
public class QuickSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quick(0, n-1, arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static int partition(int low, int high, int arr[]){
        int i=low;
        int j=high;
        int pivot=arr[i];
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>=pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quick(int i, int j, int arr[]){
        if(i<j){
            int k=partition(i,j,arr);
            quick(i, k-1, arr);
            quick(k+1, j ,arr);
        }  
    }
}