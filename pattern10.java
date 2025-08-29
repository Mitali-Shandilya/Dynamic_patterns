import java.util.Scanner;
public class pattern10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0 || n%2==0){
            System.out.print("enter n greater than 0 and odd.");
            return;
        }
        if(n==1){
            System.out.print("*");
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
            for(int j=0;j<n/2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n/2-1;i>=0;i--){
            for(int j=0;j<n/2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}