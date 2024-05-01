public class febo_recur {
    
    // static int febRec(int num){
    //         if (num == 1 || num == 0) {
    //             return 1;
    //         }
             
    //         return febRec(num-2)+febRec(num-1);
            
    // }

  
        static int febRec(int num)  
        {    
         int n1=0,n2=1,n3,i,count=10;    
         System.out.print(n1+" "+n2);//printing 0 and 1    
            
         for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
         {    
          n3=n1+n2;    
          System.out.print(" "+n3);    
          n1=n2;    
          n2=n3;    
         }    
         return num; 
        } 

    public static void main(String[] args) {
        
        int num = febRec(5);
        System.out.println(num);
    }
}
