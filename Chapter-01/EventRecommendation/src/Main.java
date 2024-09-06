/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperature;

        System.out.print("Please enter weather temperature: ");
        temperature = input.nextDouble();

        if(temperature>25) {
            System.out.println("You can go to swimming");
        } else if ( temperature>=15){
            System.out.println("You can go to picnic");
        } else if (temperature>=5) {
            System.out.println("You can go to cinema");
        } else {
            System.out.println("You can ski");
        }
    }
}