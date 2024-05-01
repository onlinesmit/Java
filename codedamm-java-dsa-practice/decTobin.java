

public class decTobin {
  public static void main(String[] args) {
    
    int n =10;
    int rev =0;
    while (n>0) {
      int rem = n%2;
      rev = rev*10 + rem;
      n =n/2;
    }
  }
  }

