import java.util.Scanner;
public class SquareHollow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        for(int i=1; i<=n; i++){
                if(i ==1 || i==n){
                    for(int k=1; k<=m; k++){
                        System.out.print("* ");
                    }
                }else{
                    for(int j=1; j<=m; j++){
                        if(j==1 || j==m){
                                System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
            }
            System.out.println();
        }
    }
}