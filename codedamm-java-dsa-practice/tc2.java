
public class tc2 {
  public static void main(String[] args) {
    int arr[] = new int[]{ 2, 4, 0, 3, 5, 8, 1, 7, 5};
    int target = 10;


    //it takes tc = n2 (quadratic)
    for(int i =0; i<arr.length; i++){
      for(int j= i+1; j<arr.length; j++){
        if(arr[i]+arr[j] == target){
          System.out.println("pair: " +arr[i] +" " +arr[j]);
        }
      }
    }
  }
  
}
