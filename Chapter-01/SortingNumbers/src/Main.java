/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z;
        System.out.print("Please enter first number: ");
        x = input.nextInt();
        System.out.print("Please enter second number: ");
        y = input.nextInt();
        System.out.print("Please enter third number: ");
        z = input.nextInt();

        if(x>y && x>z){
            if(y>z){
                System.out.println("Sorting... "+x+">"+y+">"+z);
            } else{
                System.out.println("Sorting... "+x+">"+z+">"+y);
            }
        } else if (y>x && y>z){
            if(x>z){
                System.out.println("Sorting... "+y+">"+x+">"+z);
            } else{
                System.out.println("Sorting... "+y+">"+z+">"+x);
            }
        }
        else {
            if (x>y){
                System.out.println("Sorting... "+z+">"+x+">"+y);
            } else{
                System.out.println("Sorting... "+z+">"+y+">"+x);
            }
        }
    }
}