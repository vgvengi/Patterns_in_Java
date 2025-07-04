<<<<<<< HEAD
public class Pattern1 {

/*
    ****
    ****
    ****
    ****
* */

    public static  void pattern1(int n){
=======

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
>>>>>>> fb3784138bfcaa8c57ba1a6b58e1a6030404eeff
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
<<<<<<< HEAD
    }

    public  static  void main(String args[]){
        pattern1(4);
=======

>>>>>>> fb3784138bfcaa8c57ba1a6b58e1a6030404eeff
    }
}
