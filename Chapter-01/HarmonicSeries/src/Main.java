/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double n, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: ");
        n = input.nextDouble();

        for(double i=1; i<=n;i++){
            sum +=1/i;
        }
        System.out.print("Result: "+ sum);
    }
}