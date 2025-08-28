import java.util.Scanner;
public class pattern9{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<1;i++){
            for(int j=0;j<n-1;j++){
                System.out.print("e");
            }
            for(int j=0;j<n+1;j++){
                if(j==n)System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n;j++){
                if(i==n/2)System.out.print("e");
                else System.out.print(" ");
            }
            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n;j++){
                if(i==n/2)System.out.print("e");
                else System.out.print(" ");
            }
            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<1;i++){
            for(int j=0;j<n*2-1;j++){
                
                System.out.print(" ");
            }
            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-1;j++){
                System.out.print("e");
            }
            System.out.println();
        }
    }
}