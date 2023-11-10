import java.util.Scanner;
public class Are_you_a_palindrome {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Please enter a string of pure characters with no spaces.\nPlease make sure that it has more than one(1) character: ");
        Scanner userInput = new Scanner(System.in);
        String textString = userInput.nextLine();
        String textStringLowerCase = textString.toLowerCase();
        if (!textStringLowerCase.isEmpty()) {
            if (!textStringLowerCase.contains("\\s")) {
                if (textStringLowerCase.matches("[a-z]+")) {
                    if (textStringLowerCase.length() > 1) {
                        int z = textStringLowerCase.length() - 1;
                        String reversed = "";
                        for (int i = z; i >= 0; i--) {
                            reversed += textStringLowerCase.charAt(i);
                        }
                        if (textStringLowerCase.equals(reversed)) {
                            System.out.println(textStringLowerCase + " is a palindrome");
                        } else {
                            System.out.println(textStringLowerCase + " is not a palindrome");
                        }
                    } else {
                        System.out.println("The string you supplied contains only one(1) character. Thanks.");
                    }
                } else {
                    System.out.println("The string you supplied contains not purely characters. Thanks.");
                }
            } else {
                System.out.println("The string you supplied has whitespaces. Thanks.");
            }
        } else {
            System.out.println("The string you supplied is empty. Thanks.");
        }
    }
}
