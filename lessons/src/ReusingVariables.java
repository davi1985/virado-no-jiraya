public class ReusingVariables {
    public static void main(String[] args) {
        double salary = 2500;
        double result = salary * 0.3;

        System.out.println("30% in salary: " + result);
        result = salary * 0.15;
        System.out.println("15% in salary: " + result);


    }
}
