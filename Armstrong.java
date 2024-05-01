import java.util.Scanner;

public class Armstrong {
    
    static void Armstrong1(int arm){
        int temp = arm;
        int sum =0;
        while (arm > 0) {
            int rem = arm%10;
            sum = sum + rem*rem*rem;
            arm /= 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong No: ");
        }
        else {
            System.out.println("Not a Armstrong: ");
        }

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Check: ");
        int num = sc.nextInt();
        Armstrong1(num);

        sc.close();
    }
}
