import java.util.Scanner;
public class pattern11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3 || n%2==0){
            System.out.print("invalid");
            return;
        }
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n/2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n+1;j++){
                if(j==0 || j==n-1){
                    System.out.print("@");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n-n/2-1;i++){
            for(int j=0;j<1;j++){
                System.out.print("@");
            }
            for(int j=0;j<n/2-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n/2-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<1;j++){
                System.out.print("@");
            }
            System.out.println();
        }

        for(int i=0;i<1;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
        }
    }
}