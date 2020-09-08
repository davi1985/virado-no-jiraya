public class TaxCalcWithIf {
    public static void main(String[] args) {
        double salary = 4300.00;

        double tax;

        if (salary >= 4500) {
            tax = 0.3 * salary;
            System.out.println(salary - tax);
        } else {
            tax = 0.15 * salary;
            System.out.println(salary - tax);
        }
    }
}
