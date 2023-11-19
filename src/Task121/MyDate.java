package Task121;
//import Task121.DateTask;
import static Task121.DateTask.leapYears;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1,1,1978);
        date2.setDate(21,9, 1984);
        System.out.println(date1);
        System.out.println(date2);

       // display leapyears here
        leapYears();
    }
}
