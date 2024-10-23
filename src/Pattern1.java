
/*
 Given input n=4
 output
 ****
 ****
 ****
 ****
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input N:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
