/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, baseValue, tempNumber, result=0;

        System.out.print("Please enter number: ");
        number = input.nextInt();

        tempNumber=number;
        while(tempNumber!=0){
            tempNumber /= 10;
        }

        tempNumber=number;
        while(tempNumber!=0){
            baseValue = tempNumber %10;
            result+=baseValue;
            tempNumber/=10;
        }

        System.out.println("Sum of digits are "+result);
    }
}