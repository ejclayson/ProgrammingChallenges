import java.util.Scanner;

public class Number_to_month_1_12_and_print_number_of_days_of_that_monthAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter the month's number: ");
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNextInt()){
            int month = userInput.nextInt();
            switch (month){
                case 1:
                    System.out.println("Number of days in January is 31");
                    break;
                case 2:
                    System.out.println("Number of days in February is 28");
                    break;
                case 3:
                    System.out.println("Number of days in March is 31");
                    break;
                case 4:
                    System.out.println("Number of days in April is 30");
                    break;
                case 5:
                    System.out.println("Number of days in May is 31");
                    break;
                case 6:
                    System.out.println("Number of days in June is 30");
                    break;
                case 7:
                    System.out.println("Number of days in July is 31");
                    break;
                case 8:
                    System.out.println("Number of days in August is 31");
                    break;
                case 9:
                    System.out.println("Number of days in September is 30");
                    break;
                case 10:
                    System.out.println("Number of days in October is 31");
                    break;
                case 11:
                    System.out.println("Number of days in November is 30");
                    break;
                case 12:
                    System.out.println("Number of days in December is 31");
                    break;
                default:
                    System.out.println("Invalid Month Number!");
                    break;
            }

        }else{
            System.out.println("Please input a valid number for the month's number. Thanks.");
        }
    }
}
