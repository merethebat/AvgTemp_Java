// Author: Merethe Batino
// Desc: Average Temperature
// 05-18-2026

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask the user for the number of days
        System.out.println("Enter the number of days of temperatures: ");
        int numDays = scanner.nextInt();
        
        double totalTemperature = 0.0;
        double[] temperatures = new double[numDays];
        
        // Loop to get the temperatures for each day and calculate the total temperature
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the temperature for the day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            totalTemperature += temperatures[i];
        }
        
        //calculate the average temperature
        double averageTemperature = totalTemperature / numDays;

        int aboveAverage = 0;

        //count the temperatures above the average
        for (int i =0; i < temperatures.length; i++) {
            if (temperatures[i] > averageTemperature) {
                aboveAverage++;
            }
        }

        //display results
        System.out.println();
        System.out.println("Number of days above average: " + aboveAverage);
        System.out.printf("The average temperature over %d days is: %.2f\n", numDays, averageTemperature);
        
        scanner.close();
    }
}
