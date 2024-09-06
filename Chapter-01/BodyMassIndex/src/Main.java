/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height(m): ");
        double height = input.nextDouble();

        System.out.println("Please enter your weight(kg): ");
        double weight = input.nextDouble();

        double bmi = weight/(height*height);

        System.out.println("Your Body Mass Index is: "+bmi);

    }
}