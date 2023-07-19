import javax.swing.JOptionPane;

public class CurrencyConverterDialog {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String[] options = { "Currency Converter", "Another Function", "Exit" };
        int selection = JOptionPane.showOptionDialog(
                null,
                "What function would you like to use?",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (selection) {
            case 0:
                convertCurrency();
                break;
            case 1:
                anotherFunction();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thank you for using the program. Goodbye!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please select a valid option.");
                showMenu();
                break;
        }
    }

    public static void convertCurrency() {
        String[] currencies = { "USD", "EUR", "GBP", "JPY", "KRW", "Back to Menu" };

        String selectedCurrency = (String) JOptionPane.showInputDialog(
                null,
                "Choose the currency to convert to:",
                "Currency Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                currencies,
                currencies[0]
        );

        if (selectedCurrency == null || selectedCurrency.equals("Back to Menu")) {
            // User canceled the currency selection or chose to go back to the menu
            showMenu();
            return;
        }

        String amountString;
        double amount = 0.0;
        double conversionRate = 0.0;

        // Loop until a valid numeric value is entered
        while (true) {
            amountString = JOptionPane.showInputDialog(null, "Enter the amount you want to convert to " + selectedCurrency + ":");
            if (amountString == null) {
                // User canceled the input
                showMenu();
                return;
            }

            // Validate if the input is a valid number
            try {
                amount = Double.parseDouble(amountString);
                break; // Exit the loop if the input is valid
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }

        // Get the conversion rate
        conversionRate = getConversionRate(selectedCurrency);

        // Perform the currency conversion
        double convertedAmount = amount * conversionRate;

        // Show the result
        JOptionPane.showMessageDialog(null, amountString + " Pesos Colombianos is equivalent to " + convertedAmount + " " + selectedCurrency + ".");

        // Ask the user if they want to continue
        int continueOption = JOptionPane.showConfirmDialog(null, "Do you want to continue using the program?", "Continue?", JOptionPane.YES_NO_OPTION);
        if (continueOption == JOptionPane.YES_OPTION) {
            showMenu(); // User wants to continue, show the menu again
        } else {
            JOptionPane.showMessageDialog(null, "Programa Terminado"); // Program Terminated
        }
    }

    public static void anotherFunction() {
        // Implement the code for another additional function here if desired
        JOptionPane.showMessageDialog(null, "Implementation of another function");
        showMenu();
    }

    // Replace this method with the actual conversion rates based on the selected currency
    public static double getConversionRate(String selectedCurrency) {
        // Add logic to get the conversion rate based on the selected currency
        // For example:
        if (selectedCurrency.equals("USD")) {
            return 0.00025; // Replace with actual conversion rate for Pesos to USD
        } else if (selectedCurrency.equals("EUR")) {
            return 0.00022; // Replace with actual conversion rate for Pesos to EUR
        } else if (selectedCurrency.equals("GBP")) {
            return 0.00019; // Replace with actual conversion rate for Pesos to GBP
        } else if (selectedCurrency.equals("JPY")) {
            return 0.035; // Replace with actual conversion rate for Pesos to JPY
        } else if (selectedCurrency.equals("KRW")) {
            return 0.00032; // Replace with actual conversion rate for Pesos to KRW
        }
        return 0.0; // Default value
    }
}
