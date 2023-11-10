import java.util.Scanner;
public class Count_number_of_words_in_an_input {
    public static void main(String[] args) {
        System.out.println("Please enter a string of sentence or paragraph: ");
        Scanner userInput = new Scanner(System.in);
        String textString = userInput.nextLine();
        if(!textString.isEmpty()){
            int ctr = textString.split("\\s").length;
            System.out.println("The number of words you have supplied is: " + ctr);
        }else{
            System.out.println("You have entered an empty string");
        }
    }
}
