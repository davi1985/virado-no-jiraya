public class IfAndElseExample {
    public static void main(String[] args) {
        int age = 18;
        char gender = 'F';

        if (age >= 18 || gender != 'F') {
            System.out.println("Access permitted.");
        } else {
            System.out.println("You can't access.");
        }
    }
}

