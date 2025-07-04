import java.util.Scanner;
public class LinearSearchIter{
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
        int result = linsearchiter(arr, n, key);
        if(result==-1){
            System.out.println("key element not found");
        }else{
            System.out.println("key element found "+result);
        }
        
    }
    public static int linsearchiter(int arr[], int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}