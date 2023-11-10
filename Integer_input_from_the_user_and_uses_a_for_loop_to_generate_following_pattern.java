import java.util.Scanner;
public class Integer_input_from_the_user_and_uses_a_for_loop_to_generate_following_pattern {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("This program collects a valid digit only.\nNo whitespace/s please!\nPlease enter a valid digit: ");
        String uiString=ui.nextLine();
        if(!uiString.isEmpty()){
            if(!uiString.contains("\\s")&&!uiString.contains(" ")&&!uiString.contains("\t")){
                if(uiString.matches("[0-9.]+")){
                    int x = Integer.parseInt(uiString);
                    int b = x;
                    int c = x;
                    for(int d = 1 ; d <= x ; d++){
                        for(int a = 1 ; a <= x*2; a++ ){
                            if(a<=b&&a>=c){
                                System.out.print("\t*");
                            }else{
                                System.out.print("\t ");
                            }
                        }
                        b++;
                        c--;
                        System.out.println();
                    }
                }else{
                    System.out.println("The string you supplied contains not purely number/s. Thanks.");
                }
            }else{
                System.out.println("You supplied a string with whitespace/s");
            }
        }else{
            System.out.println("You supplied an empty string. Thanks");
        }
    }
}
