/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, result=1;

        System.out.print("Please enter number: ");
        x = input.nextInt();
        System.out.print("Please enter prime: ");
        y = input.nextInt();

        for(int i=1; i<=y; i++){
            result *=x;
        }
        System.out.print("Result: "+result);
    }
}