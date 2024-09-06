/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //User inputs: radius and alfa angle
        double r = input.nextDouble();
        double alfa = input.nextDouble();

        // Calculating area
        double area = (Math.PI*r*r*alfa)/360.0;

        // Printing result
        System.out.println("Area");
        System.out.println(".....");
        System.out.print(area);

    }
}