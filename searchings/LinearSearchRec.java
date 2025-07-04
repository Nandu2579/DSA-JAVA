import java.util.Scanner;
public class LinearSearchRec{
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
        int i=0;
        int result = linsearchrec(arr, n, i, key);
        if(result==-1){
            System.out.println("key element not found");
        }else{
            System.out.println("key element found "+result);
        }
        
    }
    public static int linsearchrec(int arr[], int n, int i, int key){
        if(i>=n){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return linsearchrec(arr, n, i+1, key);
    }
}