/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Please enter year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if(year% 400 ==0){
                    System.out.print(year + " is a leap year.");
                }
                else {
                    System.out.print(year + " is a not leap year.");
                }
            } else {
                System.out.print(year + " is a leap year.");
            }
        } else {
            System.out.print(year + " is not a leap year.");
        }

    }
}