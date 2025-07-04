public class Pattern5 {
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            //for spacing
            for(int j=1; j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //spacing
            for (int j =1;j<=n-i;j++){
                System.out.print("");
            }
            System.out.println( );
        }

    }
    public static  void main (String args[]){
        pattern5(5);
    }
}
