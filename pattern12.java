import java.util.Scanner;
public class pattern12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3 || n%2==0){
            System.out.print("invalid");
            return;
        }
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n/2+i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-2*i;j++){
                System.out.print("@");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}