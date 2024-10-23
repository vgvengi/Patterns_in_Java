

//Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on.
// You are given a number N, you have to output the number of integers less than N in the sample
// space S.


import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        int count=0,i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<n;i++){
            if(i*i<n){
                count++;
            }
        }
        System.out.println(count);
    }
    }
