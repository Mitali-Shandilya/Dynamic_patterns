import java.util.Scanner;
public class pattern5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n+2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n+2*n;j++){
                if(j>=i && j<=n-i-1 || j>=2*n+i && j<n+n*2-i){
                    System.out.print("e");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}