/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number, sum=0, average;
        int counter=0;

        System.out.print("Please enter number: ");
        number = input.nextDouble();
        input.nextLine();

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                sum += i;
                counter++;
            }
        }

        if(counter>0){
            average = sum/counter;
            System.out.println("Average : "+average);
        } else {
            System.out.println("No number divisible by both 3 and 4 was found between 0 and " + number + ".");
        }
    }
}