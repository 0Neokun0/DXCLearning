package Java_Flow_Control;
public class if_statements {
    public static void main(String[] args) {
        // if Statement
        int number = 10;
        // checks if number is less than 0
        if (number < 0) {
            System.out.println("The number is negative.");
        }
        System.out.println("Statement outside if block");

        // if...else Statement
        int number1 = 20;
        // checks if the number is greater than 10
        if (number1 > 0) {
            System.out.println("The number is positive");
        }
        // execute this block
        // if number is not greater than 10
        else {
            System.out.println("The number is not possible.");
        }
        System.out.println("Statement outside if...else block.");
    }

}
