import java.util.Scanner;
public class pattern7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<2*n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("e");
            }
            System.out.println();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<2*n+2;j++){
                if(j==2*n+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n+2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(i==0 || j==0)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
           for(int j=0;j<n/2+1;j++){
                if(j>=i-(n/2) && j>=(n/2)-i) System.out.print("e");
                else System.out.print(" ");
            }

            for(int j=0;j<n/2+2;j++){
                if(i==n/2) System.out.print("*");
                else System.out.print(" ");
            }
            
            for(int j=0;j<1;j++){
                if(i>n/2)System.out.print(" ");
                else System.out.print("*");
            }
            /*for(int j=0;j<n;j++){
                if(i<=n/2 && j==n-1 || i==n/2) System.out.print("*");
                else System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}