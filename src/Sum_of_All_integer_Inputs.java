import java.util.Scanner;
public class Sum_of_All_integer_Inputs {
    public static void main(String[] args) {
        int sum=0, c;
        System.out.println("How many numbers to sum up?: ");
        Scanner a = new Scanner(System.in);
        if(a.hasNextInt()){
            int aa = a.nextInt();
            if(aa>0){
                for(c=1;c<=aa;c++){
                    System.out.println("Enter the number " + c + " digit: ");
                    Scanner z = new Scanner(System.in);
                    if(z.hasNextInt()){
                        sum=sum+z.nextInt();
                    }
                    else{
                        System.out.println("Please input a valid number");
                    }
                }
                System.out.println("Total sum of all numbers is: " + sum);
            }
            else{
                System.out.println("The number you input must be greater than zero");
            }
        }else{
            System.out.println("Please input a valid number. Thanks.");
        }
    }
}
