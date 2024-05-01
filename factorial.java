public class factorial {
    
    // static int fact(int num){
    //     if (num ==0 ) {
    //         return 1;
    //     }
    //     int f=1;

    //     for(int i =1; i<=num; i++){
    //         f = f*i;
    //         //System.out.println(f);
    //     }

    //     return f;
    // }

static int fact(int num){
    int f =5;
        if (num ==0 || num ==1 ) {
            return 1;
        }
        return f*fact(num-1);
    }
    public static void main(String[] args) {
        
        int num = fact(5);
        System.out.println(num);
    }
}

