import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        // Validate user input for choice
        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2:");
            choice = scanner.nextInt();
        }

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;

        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, convertedTemperature);
        } else {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, convertedTemperature);
        }
        
        scanner.close();
    }
}
