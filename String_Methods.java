import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {
        System.out.print("Please enter a string with no spaces: ");
        Scanner userInput = new Scanner(System.in);
        String textString = userInput.nextLine();
        if(!textString.isEmpty()){
            if(!textString.contains(" ")&&!textString.contains("\\s")&&!textString.contains("\t")) {
                if (textString.length() > 6) {
                    System.out.println("the length of \"" + textString + "\" is: " + textString.length());
                    System.out.println("the result of converting all characters of \"" + textString + "\" to uppercase is: " + textString.toUpperCase());
                    System.out.println("the result of converting all characters of \"" + textString + "\" to lowercase is: " + textString.toLowerCase());
                    System.out.println("the result of printing the first character of \"" + textString + "\" is: " + textString.charAt(0));
                    System.out.println("the result of printing the last character of \"" + textString + "\" is: " + textString.charAt(textString.length() - 1));
                    System.out.println("the result of printing the substring starting from the second to the fifth character of \"" + textString + "\" is: " + textString.substring(2, 5));
                } else {
                    System.out.println("The string you supplied is less than 6 characters only. Thanks.");
                }
            }else{
                System.out.println("The string you supplied has whitespaces. Thanks.");
            }
        }else{
            System.out.println("The string you supplied is empty. Thanks.");
        }
    }
}
