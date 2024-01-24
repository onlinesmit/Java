public class CountDublicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6, 6, 7};
        countDuplicates(arr);
    }

    static void countDuplicates(int[] arr) {
        int[] count = new int[arr.length];

        System.out.println("Duplicate numbers are: ");
        for (int num : arr) {
            count[num]++;
            
            if (count[num] > 1) {
                System.out.println(num);
                count[num] = 0;  //reset count to avoid dublicate value 
            }
        }
    }
}
