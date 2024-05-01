public class Pelindrome { 
    public static void main(String[] args) {
        Pelindrome sc = new Pelindrome();
        sc.Logic1();  
    }

    void Logic1(){
        String str = "SmimS";
        boolean b =false;
        for(int i=0, j=str.length()-1; i<j; i++, j-- ){
            if (str.charAt(i) == str.charAt(j)) {
                b = true;
                break;
            }
        }
        
        if (b) {
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("Not: ");
        }
    }
}