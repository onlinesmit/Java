import java.util.Arrays;

public class Anagram {
    
    static String Anagram1(String str1, String str2){

        if (str1.length() != str2.length()) {
            return "No";
        }
        
        char[] chAr1 =  str1.toCharArray();
        char[] chAr2 = str2.toCharArray();

        Arrays.sort(chAr1);
        Arrays.sort(chAr2);
        System.out.println(chAr1);
        System.out.println(chAr2);

        // for(int i =0; i<str1.length(); i++){
        //     if (chAr1[i] != chAr2[i]) {
        //         return "No";
        //     }
        // }
        // return "Yes";
        if(Arrays.equals(chAr1, chAr2)){
            return "Yes";
        }
        else return "No";
        }
        public static void main(String[] args) {
           String  str1 = "smit";
           String  str2 = "sim";

          System.out.println(Anagram1(str1, str2)); 
        }
    }

