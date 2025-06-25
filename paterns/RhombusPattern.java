import java.util.Scanner;
public class RhombusPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}