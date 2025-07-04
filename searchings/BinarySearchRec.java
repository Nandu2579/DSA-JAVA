import java.util.Scanner;
public class BinarySearchRec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value");
        int key = sc.nextInt();
        int valid= binsearchrec(arr, n, key, 0, n-1);
        if(valid == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found "+valid);
        }
    }
    public static int binsearchrec(int arr[], int n , int key, int low, int high){
        if(low<=high){
          int mid = (low+high)/2;
          if(arr[mid]==key){
            return mid;
          }  
          else if(arr[mid]<key){
            return binsearchrec(arr, n ,key, mid+1, high);
          }
          else{
            return binsearchrec(arr, n, key, low, mid-1);
          }
        }
        return -1;
    }
}