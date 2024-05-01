public class GreatestTree {
    static void GreatestTree1(int a, int b, int c){
        int d = (a>b) ? (a>c ? a : c) : (c>b) ? c: b;
        System.out.println(d);
        // int d = ((a>b) ? (a>c))  ? a : (b > c) ? b: c ;

    }
    public static void main(String[] args) {
        GreatestTree1(3, 5, 6);
    }
}
