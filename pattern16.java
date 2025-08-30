import java.util.Scanner;
public class pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3 || n%2==0){
            System.out.print("enter n greater than 0 and odd.");
            return;
        }
        for(int i=0;i<1;i++) {
            for(int j=0;j<n*4-1;j++){
                if(j<n-1)System.out.print("e");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n+2;i++){
            for(int j=0;j<n-1;j++){
                if(j<n-2) System.out.print(" ");
                else System.out.print("*");
            }

            for(int j=0;j<n;j++){
                if(i==(n+2)/2) System.out.print("e");
                else System.out.print(" ");
            }

            for(int j=0;j<1;j++){
                if(i>0 && i<n+1) System.out.print("*");
                else System.out.print(" ");
            }

            for(int j=0;j<n;j++){
                if(i==(n+2)/2) System.out.print("e");
                else System.out.print(" ");
            }

            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<1;i++) {
            for(int j=0;j<n*4-1;j++){
                if(j<n*3)System.out.print(" ");
                else System.out.print("e");
            }
            System.out.println();
        }        
    }
}