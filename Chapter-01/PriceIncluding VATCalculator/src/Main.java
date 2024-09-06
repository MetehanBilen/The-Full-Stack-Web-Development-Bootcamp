/**
 * @author Metehan Bilen
 * @since September 2024
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables price and tax ratio
        float price, taxRatio;

        // User to enter price
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Price: ");
        price = input.nextFloat();

        // Determining tax ratio based on price range
        taxRatio = (float) ((price>0 && price<1000.0) ? 20.0 : 10.0);

        // Printing Result
        System.out.println("Price without VAT: "+(price));
        System.out.println("Price including VAT: " + (price+(price*taxRatio/100.0)));
        System.out.println("Tax Ratio : "+taxRatio+ " %");
        }
    }