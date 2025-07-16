import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int min=i, temp;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}