public class primeNo {
    
    static void checkPrime(int num){
        int temp =0;
        for(int i =1; i<=num; i++){
            if (num % i == 0) {
                temp++;
            }
        }

        if (temp == 2) {
            System.out.println("It's a prime Number");
        }
        else
        {
            System.out.println("Not a prime: ");
        }
    }
    public static void main(String[] args) {
        checkPrime(4);
    }
}
