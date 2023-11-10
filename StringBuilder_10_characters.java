import java.util.Scanner;
public class StringBuilder_10_characters {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a string with no spaces: ");
        String textString = userInput.nextLine();
        StringBuilder strBldrTextString  = new StringBuilder(textString);
        boolean flag = true;
        if(strBldrTextString.length() != 0){
            if(strBldrTextString.length() >= 10){
                //if(!textString.contains(" ")&&!textString.contains("\\s")&&!textString.contains("\t"))
                if(!strBldrTextString.toString().contains(" ")&&!strBldrTextString.toString().contains("\\s")&&!strBldrTextString.toString().contains("\t")){
                    System.out.println("1. The length of \"" + strBldrTextString + "\" is :" + strBldrTextString.length());
                    System.out.println("2. The first character of \"" + strBldrTextString + "\" is :" + strBldrTextString.charAt(0));
                    System.out.println("3. The last character of \"" + strBldrTextString + "\" is :" + strBldrTextString.charAt(strBldrTextString.length()-1));
                    if(strBldrTextString.toString().contains("a")){
                        System.out.println("4. The index of the first letter \'a\' in \"" + strBldrTextString + "\" is: " +strBldrTextString.indexOf("a"));
                    }else{
                        System.out.println("4. The \"" + strBldrTextString + "\" has no letter \'a\' at all.");
                    }
                    System.out.println("5. The substring of \"" + strBldrTextString + "\" from index 3 to index 6 is: " + strBldrTextString.substring(3,6));
                    System.out.println("6. If you append the string \"123\" to the end of\"" + strBldrTextString + "\" the result is: " + strBldrTextString.append("123"));
                    System.out.println("7. If you insert the string \"xyz\" at index 4 of\"" + strBldrTextString + "\" the result is: " + strBldrTextString.insert(4, "xyz"));
                    System.out.println("8. If you delete the substring from index 2 to index 4 from \"" + strBldrTextString + "\" the result is: " + strBldrTextString.delete(2, 4));
                    System.out.println("9. If you delete the character at index 8 of \"" + strBldrTextString + "\" the result is: " + strBldrTextString.delete(8,8));
                    System.out.println("10. The reverse of \"" + strBldrTextString + "\" is: " + strBldrTextString.reverse());
                }else{
                    System.out.println("The string you supplied has whitespaces. Thanks.");
                }
            }else{
                System.out.println("The string you supplied is less(<) than ten(10). Thanks.");
            }
        }
        else{
            System.out.println("The string you supplied is empty. Thanks.");
        }
    }
}
