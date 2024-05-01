public class moveHash {

    
    static void moveHash1(String str, int len){
        StringBuilder sc = new StringBuilder(str);
            
        for(int i =0; i < len; i++){
            int k=0;
            if(sc.charAt(i) == '#'){
              char temp = sc.charAt(i);

            for(int j =i; j > k; j--){
                sc.setCharAt(j, sc.charAt(j-1));
            }
            sc.setCharAt(k, temp);
            k++;
            }
        }
         System.out.println(sc.toString());
    }
    public static void main(String[] args) {
        moveHash1("move#hash#", 10);
    }
    
}
