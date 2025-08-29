import java.util.Scanner;
public class pattern15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        if(n<2){
            System.out.print("invalid");
            return;
        }
        for(int i=0;i<n*2+n;i++){
            boolean flag=false;
            if(i<n+1) System.out.print("@");
            else System.out.print(" ");
            for(int j=0;j<n*(n-1)+1;j++){
                if(i>=n && i<=n+(n-1)){
                    if(j<(n-1)*x || j>(n-1)*x+n-1){
                        System.out.print(" ");
                    }
                    else System.out.print("*");
                    flag=true;
                }
                else System.out.print(" ");
            }
            if(flag) x++;
            if(i>=n+(n-1)) System.out.print("@");
            else System.out.print(" ");
            System.out.println();
        }
    }
}