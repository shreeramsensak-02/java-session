
public class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;
        int marks = 85;

        boolean result1 = age >= 18 && marks >= 50;
        boolean result2 = age < 18 || marks > 80;
        boolean result3 = !(age == 20);

        System.out.println("AND (&&): " + result1);
        System.out.println("OR (||): " + result2);
        System.out.println("NOT (!): " + result3);
    }
}
