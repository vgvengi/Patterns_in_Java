<<<<<<< HEAD
public class Pattern2 {
    public  static  void pattern2(int n){
=======
import java.util.Scanner;

public class Pattern2 {

    /*
    input n=5
    output
    *
    **
    ***
    ****
    *****
     */
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
>>>>>>> fb3784138bfcaa8c57ba1a6b58e1a6030404eeff
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
<<<<<<< HEAD
    public  static  void main(String args[]){
        pattern2(4);
    }
=======
>>>>>>> fb3784138bfcaa8c57ba1a6b58e1a6030404eeff
}
