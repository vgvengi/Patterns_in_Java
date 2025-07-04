import java.util.Scanner;

// How many perfect square within a given  input
/*
 input is 10 means
 perfect square 1*1 =1 , 2*2=4 ,3*3=9
 */
public class Hello {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value : ");
        int i, count=0, n=input.nextInt();
        for(i=1;i<n;i++){
            if(i*i<n){
                count ++;
            }
        }
        System.out.println(count);
    }
}