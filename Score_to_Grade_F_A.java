import java.util.Scanner;
public class Score_to_Grade_F_A {
    public static void main(String[] args) {
        System.out.println("Please enter the student's test score: ");
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNextInt()){
            int testScore = userInput.nextInt();
                if(testScore>=90){
                System.out.println("The student's grade base on the test score is: A grade");
                }else if(testScore>=80&&testScore<90){
                    System.out.println("The student's grade base on the test score is: B grade");
                }else if(testScore>=70&&testScore<80){
                    System.out.println("The student's grade base on the test score is: C grade");
                }else if(testScore>=60&&testScore<70){
                    System.out.println("The student's grade base on the test score is: D grade");
                }
                else if(testScore<60&&testScore>=0){
                    System.out.println("The student's grade base on the test score is: F grade");
                }else{
                    System.out.println("The test score of the student cannot be a negative number!");
                }
        }else{
            System.out.println("Please input a valid number for the test score of the student. Thanks.");
        }
    }
}

