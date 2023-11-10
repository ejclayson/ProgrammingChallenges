import java.util.Scanner;
public class Sum_and_average_of_input_array_numbers {
    public static void main(String[] args)
    {
        boolean flag = true;
        int sum = 0;
        Scanner ui = new Scanner(System.in);
        System.out.print("Please enter the number of strings you want to enter: ");
        String uiString=ui.nextLine();
        if(!uiString.isEmpty()){
            if(!uiString.contains("\\s")){
                if(uiString.toLowerCase().matches("[0-9.]+")){
                    String[] stringOfUi = new String [Integer.parseInt(uiString)];
                    for(int i = 0 ; i < stringOfUi.length ; i++ ){
                        stringOfUi[i] = ui.nextLine();
                    }
                    for(int z = 0 ; z < stringOfUi.length ; z++){
                        if(stringOfUi[z].matches("[0-9.]+")){
                            sum += Integer.parseInt(stringOfUi[z]);
                        }
                        else{
                            System.out.println("One of the string you supplied contains not purely number/s. Thanks.");
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("Total average of total sum is: " +sum/stringOfUi.length);
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
