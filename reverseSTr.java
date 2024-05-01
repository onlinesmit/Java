public class reverseSTr {
    public static void main(String[] args) {
        String s = new String("Smit kumar Gupta");
        Reverse(s);
        String remSp = removeSpace(s);
        
        //System.out.println(rev);
        System.out.println(remSp);
    }
    
    static String removeSpace(String s){
        return s.replaceAll("\\s", ""); 
    }

    static String Reverse(String s){
        char[] ca = s.toCharArray();
        for(int i =0, j = s.length()-1; i<j; i++, j-- ){
                char temp = ca[i];
                ca[i] = ca[j];
                ca[j] = temp;
        }

        System.out.println(ca);
        return s;
    }
}
