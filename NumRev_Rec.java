public class NumRev_Rec {
    
    static int RevNumber(int num, int sum){
        if(num > 0){
            int t = num % 10;
            sum = sum * 10 + t;
            // Recursive call to RevNumber
            return RevNumber(num / 10, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = RevNumber(123, 0);
        System.out.println(n);
    }
}
