public class TaxCalcWithIf {
    public static void main(String[] args) {
        double salary = 4550.00;

        double tax;

        if (salary > 4500) {
            tax = 0.3 * salary;
        } else {
            tax = 0.15 * salary;
        }

        System.out.println("Tax: " + tax);
        System.out.println("Balance: $" + (salary - tax));
    }
}
