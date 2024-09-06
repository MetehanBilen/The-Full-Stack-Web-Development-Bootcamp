/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, inputPassword, newPassword,dbPassword ="1234";
        int ans;


        System.out.print("Please enter your username: ");
        username = input.nextLine();
        System.out.print("Please enter your password: ");
        inputPassword = input.nextLine();

        if ((username.equals("admin")) && (inputPassword.equals(dbPassword))) {
            System.out.println("Login successfully!");
        } else {
            System.out.println("Login failed!");
            System.out.println("Do you want to reset your password?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            ans = input.nextInt();
            input.nextLine();

            if (ans == 1) {
                System.out.print("Please enter your new password: ");
                newPassword = input.nextLine();
                System.out.println(newPassword);
                if (newPassword.equals(inputPassword)) {
                    System.out.println("Don't use your previous password!"); // Check previous password
                } else {
                    System.out.println("Login successfully!");
                }
            } else {

                System.out.println("Login Failed!");
            }
        }
    }

}