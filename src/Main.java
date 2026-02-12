import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 1, 1000.0);
        PriceCalculator calculator = new PriceCalculator();
        PaymentProcessor payment = new PaymentProcessor();
        NotificationService nService = new NotificationService();

        System.out.println("Total: " + calculator.calculateTotalPrice(order));
        payment.processPayment("Card");
        nService.sendConfirmationEmail("test@test.com");

        EmployeeSalaryCalculator sCalc = new EmployeeSalaryCalculator();
        System.out.println("Salary: " + sCalc.calculateSalary(5000, new PermanentSalary()));

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print("Doc");
        printer.scan("Doc");

        NotificationServiceDIP dip = new NotificationServiceDIP(Arrays.asList(new EmailSender(), new SmsSender()));
        dip.sendNotification("SOLID message");
    }
}