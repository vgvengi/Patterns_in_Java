import java.util.Scanner;
<<<<<<< HEAD

public class Pattern4 {
    public static void pattern4(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void main (String []args){
        pattern4(5);

    }
=======
/*
Given an integer n. You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:
                    *****
                    ****
                    ***
                    **
                    *
*/

public class Pattern4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
>>>>>>> fb3784138bfcaa8c57ba1a6b58e1a6030404eeff
}
