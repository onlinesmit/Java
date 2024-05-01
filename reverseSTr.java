import java.util.Scanner;

public class reverseSTr {
    
    static String Rev(String s){
        char[] ch =  s.toCharArray();
        
        // Reverse the char array
        for(int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        // Convert the reversed char array back to a string
        String reversed = new String(ch);

        // Print the reversed string
        System.out.println(reversed); 

        // Return the rev string without spaces
        return reversed.replaceAll(" ", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String OStr = sc.nextLine();

        System.out.println(Rev(OStr));

        sc.close();
    }
}

