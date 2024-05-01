import java.util.*;

public class toCharArray {
    public static void main(String[] args) {
        // Write Java code here
        String str = "an apple a day keep doctor away";
        // StringBuilder result = new StringBuilder();
        int f = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' && i == 0) || (str.charAt(i) == 'a' && str.charAt(i - 1) == ' ')) {
                f = i;
                for (; i < str.length(); i++) {
                    if (str.charAt(i) == ' ') {
                        break;
                    }
                }
                for (int j = f, k = i - 1; j < k; j++, k--) {
                    char temp = str.charAt(j);
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(j, sb.charAt(k));
                    sb.setCharAt(k, temp);
                    str = sb.toString();
                }
            }
        }
        System.out.println(str);
    }
}
