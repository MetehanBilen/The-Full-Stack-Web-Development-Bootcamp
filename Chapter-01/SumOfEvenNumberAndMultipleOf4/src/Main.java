/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number, sum = 0;

        do {
            System.out.print("Enter number: ");
            number = input.nextDouble();
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }
        while (number % 2 == 0);

        System.out.print("Total is " + sum);

    }
}
