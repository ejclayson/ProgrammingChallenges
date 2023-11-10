import java.util.Scanner;
public class Number_to_day_of_the_week {
    public static void main(String[] args) {
        System.out.println("Please enter the number of the day in a week: ");
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNextInt()){
            int month = userInput.nextInt();
            switch (month){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }else{
            System.out.println("invalid input");
        }
    }
}
