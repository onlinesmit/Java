import java.util.Scanner;

public class pelindromeNo {
    static void pelindromeNo1(int n){
        int temp = n;
        int sum =0;

        while (n > 0) {
           
            int rem = n%10;
            n /= 10;
            sum = sum*10 +rem;
        }
        if (sum == temp) {
            System.out.println("Pelindrome:");
        }
        else {
            System.out.println("Not Pelindrome: ");
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to checking pelindrome or not: ");
        int num = sc.nextInt();
        pelindromeNo1(num);
    
    }
}
