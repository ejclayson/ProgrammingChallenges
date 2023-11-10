import java.util.Scanner;
public class Check_vowels_and_consonants {
    public static void main(String[] args) {
        System.out.println("Please enter a string of pure characters with no spaces: ");
        Scanner userInput = new Scanner(System.in);
        String textString = userInput.nextLine();
        String textStringNew = textString.replaceAll("\\s", "");
        if(!textStringNew.isEmpty()){

            int i = 0;
            while(i < textStringNew.length()){
                if(!Character.isLetter(textStringNew.charAt(i))){
                    System.out.println("You have not entered a string of characters");
                    break;
                }
                else{
                    String textStringLowerCase = textStringNew.toLowerCase();
                    if(textStringLowerCase.charAt(i)=='a'||textStringLowerCase.charAt(i)=='e'||textStringLowerCase.charAt(i)=='i'||textStringLowerCase.charAt(i)=='o'||textStringLowerCase.charAt(i)=='u'){
                        System.out.println(textStringNew.charAt(i) + " is a vowel.");
                    }else{
                        System.out.println(textStringNew.charAt(i) + " is a consonant.");
                    }
                }
                i++;
            }
        }else{
            System.out.println("You have entered an empty string");
        }

    }
}
