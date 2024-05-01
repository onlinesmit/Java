import java.util.Scanner;

public class EvenOdd {
    
    // static void EO(int n){
    //     if (n%2 ==0) {
    //         System.out.println("Even: ");   
    //     }
    //     else
    //     {
    //         System.out.println("Odd: ");
    //     }
    // }

    static int EO(int n){
        if (n%2 ==0) {
            return 0;       
         }
        else
        {
        return 1;
        }
    }

    public static void main(String[] args) {
        Scanner c =new Scanner(System.in);
        System.out.println("Enter the nuber to check: ");
        int x = c.nextInt();
        // EO(x);

        if (EO(x)==0) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd: ");
        }
        c.close();
    }

}
