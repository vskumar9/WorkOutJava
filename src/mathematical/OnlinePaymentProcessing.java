package mathematical;

import java.util.Scanner;

class PaymentValidationException extends Exception {
    public PaymentValidationException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class PaymentService {
    public void validatePaymentDetails(String paymentDetails) throws PaymentValidationException {
        // Assuming the payment details should be a non-empty string
        if (paymentDetails == null || paymentDetails.isEmpty()) {
            throw new PaymentValidationException("Payment details are invalid.");
        }
    }

    public void checkAccountBalance(double balance, double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
    }
}

public class OnlinePaymentProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService paymentService = new PaymentService();

        // Reading inputs
        String paymentDetails = scanner.nextLine();
        double accountBalance = Double.parseDouble(scanner.nextLine());
        double paymentAmount = Double.parseDouble(scanner.nextLine());

        try {
            paymentService.validatePaymentDetails(paymentDetails);
            paymentService.checkAccountBalance(accountBalance, paymentAmount);
            System.out.println("Payment processed successfully.");
        } catch (PaymentValidationException e) {
            System.out.println("Payment details are invalid.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance.");
        }

        scanner.close();
    }
}
