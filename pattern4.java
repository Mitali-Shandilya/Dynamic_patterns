import java.util.Scanner;
public class pattern4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                System.out.print(" ");
            }

            for(int j=0;j<n+2;j++){
                if((i==0 || i==n-1 && j>=0 && j<=n+1) ||
                j==0 || j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                System.out.print(" ");
            }

            for(int j=0;j<n+2;j++){
                if(j==0 || j==n+1) System.out.print("e");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<2*n+1;j++){
                if(j>=i && j<=n-i-1 || j>=n+1+i && j<=2*n-i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}