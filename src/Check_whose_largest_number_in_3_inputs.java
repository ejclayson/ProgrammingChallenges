import java.util.Scanner;
public class Check_whose_largest_number_in_3_inputs {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers: ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        if(a.hasNextInt()&&b.hasNextInt()&&c.hasNextInt()){
            int aa = a.nextInt();
            int bb = b.nextInt();
            int cc = c.nextInt();
            if(aa == bb && aa == cc && bb == cc){
                System.out.println("All numbers are equal");
            }else if(aa > bb && aa > cc){
                System.out.println("Largest number is: " + aa);
            }else if(bb > aa && bb > cc){
                System.out.println("Largest number is: " + bb);
            }else{
                System.out.println("Largest number is: " + cc);
            }
        }else{
            System.out.println("All inputs should be a valid number. Thanks.");
        }
    }
}

