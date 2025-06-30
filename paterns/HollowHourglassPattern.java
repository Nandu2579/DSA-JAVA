import java.util.Scanner;
public class HollowHourglassPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            }
            else{
                for(int k=1; k<=i; k++){
                    if(k==1 || k==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            }
            else{
                for(int k=1; k<=i; k++){
                    if(k==1 || k==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}