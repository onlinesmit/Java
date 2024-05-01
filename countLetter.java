public class countLetter {

    static void countLetter1(String str){
        int len = str.length();
        int cnt =1; 
        int i;
        for(i =0; i<len-1; i++){
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            }
            else{
            System.out.print(str.charAt(i) + "" +cnt);
            cnt =1;
            }
        }
        System.out.print(str.charAt(i) + "" +cnt);

    }

    public static void main(String[] args) {
        String s = "aabbbcccdd";
        countLetter1(s);
    }
}
