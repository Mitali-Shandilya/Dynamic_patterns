import java.util.Scanner;
public class pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n/2+2;i++){
            for(int j=0;j<n+2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2+1;j++){
                if(j>=i-(n/2) && j>=(n/2)-i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=0;j<n+4;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n/2+1;j++){
                if(j>=i-(n/2) && j>=(n/2)-i)
                    System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n/2+2;i++){
            for(int j=0;j<n+i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n+2-(2*i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}