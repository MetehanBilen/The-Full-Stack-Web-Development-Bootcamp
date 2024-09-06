/**
 * @author Metehan Bilen
 * @since September 2024
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Defining Variables
        double km, taxiFare, initCharge = 10.0, meteredFare = 2.20, minTaxiFare = 20.0;

        //Initializing Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter KM: ");
        km = input.nextDouble();

        // Calculating taxi fare
        taxiFare = initCharge+(km*meteredFare);

        // Printing result
        System.out.print(taxiFare<minTaxiFare ? "Taxi Fare is: "+minTaxiFare : "Taxi Fare is: " + taxiFare );
    }
}