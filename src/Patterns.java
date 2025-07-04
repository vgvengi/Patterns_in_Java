public class Patterns {
    public static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    ///////////////////////////////////////////////////////////
    public  static void pattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("& ");
            }
            System.out.println();
        }
    }
    ////////////////////////////////////////////////
    // This is Take you forward pattern 3
    /*
    1
    12
    123
    1234
    12345
    */
    public static void pattern3(int n){
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
///////////////////////////////////////////////////////////
    public static void main(String args[]){
//        pattern1(4);
//        pattern2(4);
        pattern3(5);
    }
}
