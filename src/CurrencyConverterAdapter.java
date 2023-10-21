public class CurrencyConverterAdapter implements CurrencyConverter {
    private static final double USD_TO_KZT_EXCHANGE_RATE = 500;

    @Override
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equalsIgnoreCase("USD") && toCurrency.equalsIgnoreCase("KZT")) {
            return amount * USD_TO_KZT_EXCHANGE_RATE;
        }
        return amount;
    }
}