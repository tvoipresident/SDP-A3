import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Adapter: CurrencyConverterAdapter
        CurrencyConverter currencyConverter = new CurrencyConverterAdapter();
        // Client code using the adapter with user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        double convertedAmount = currencyConverter.convertCurrency(amount, "USD", "KZT");

        System.out.println("Converted amount: " + convertedAmount + " KZT");
    }
}