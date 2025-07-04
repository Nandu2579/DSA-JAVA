import java.util.Scanner;
public class BinarySearchIter{
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
        int valid= binsearchiter(arr, n,  key);
        if(valid == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found "+valid);
        }
    }
    public static int binsearchiter(int arr[], int n, int key){
        int low = 0;
        int high=n-1;
        int mid;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}