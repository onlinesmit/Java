import java.util.Arrays;

public class CountFreq {

        static void countfreq(int[]  arr){
            int len = arr.length;
            int cnt =1; 
            int i;
            Arrays.sort(arr);
            for(i =0; i<len-1; i++){
                if (arr[i] == arr[i+1]) {
                    cnt++;
                }
                else{
                    System.out.println(arr[i] + " Occurs " +cnt+ " Times");
                    cnt =1;
                }
            }
            System.out.println((arr[i]) + " Occurs " +cnt+ " Times");
                    
        }
    
        public static void main(String[] args) {
            int a[]  = {1, 2, 3, 4, 2, 1, 4, 5};
            countfreq(a);
        
    }
    
}
