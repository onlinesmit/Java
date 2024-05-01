public class tc{
  public static void main(String[] args) {
    int arr[] = new int[]{1, 2, 4, 8 , 6, 33, 5};

    //linear way  tc = O(n)

    var startTime = System.nanoTime();
    for(int i =0; i<arr.length; i++){
      if(arr[i] == 33){
        System.out.println("No. found at index: " +i);
      }
    }

    var endtime = System.nanoTime();

    System.out.println("linear Timming: " +(endtime - startTime));

      //binary way  tc = O(logn)

      startTime = System.nanoTime();

      int start =0;
      int end = arr.length-1;
      
      while(start <end){
        int mid = (start+end)/2;
        if (arr[mid] == 33) {
          System.out.println("No. found at: " +mid);
          break;
        }
        else if(arr[mid] < 33){
          start = mid +1;
        }
        else{
          end = mid -1;
        }
      }

       endtime = System.nanoTime();
       System.out.println("BS Timming: " +(endtime - startTime));

  }
}