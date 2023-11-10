import java.util.Scanner;
public class Odd_or_even_positive_or_negative_or_zero {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner a = new Scanner(System.in);
        if(a.hasNextInt()){
            int aa = a.nextInt();
            if(aa == 0){
                System.out.println("Zero & Even Number");
            }else if(aa < 0 && aa % 2 == 0){
                System.out.println("Negative & Even Number");
            }else if(aa > 0 && aa % 2 == 0){
                System.out.println("Positive & Even Number");
            }else if(aa < 0 && aa % 2 != 0){
                System.out.println("Negative & Odd Number");
            }else if(aa > 0 && aa % 2 != 0){
                System.out.println("Positive & Odd Number");
            }else{
                System.out.println("Not Valid");
            }
        }else{
            System.out.println("Please input a valid number. Thanks.");
        }
    }
}
