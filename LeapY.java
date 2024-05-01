public class LeapY {

    static void CheckLeap(int year){
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year+ " is a Leap year: ");
        }
        else{
            System.out.println(year+ " is Not a Leap year: ");
        }
    }

    public static void main(String[] args) {
        CheckLeap(20);
    }
}
