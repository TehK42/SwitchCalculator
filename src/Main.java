import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float num1;
        float num2;
        char operator;
        double answer = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("First number = ");
        num1 = input.nextFloat();

        System.out.println("Second number = ");
        num2 = input.nextFloat();

        System.out.println("Operator is ");
        operator = input.next().charAt(0);

        switch (operator){
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1/num2;
                break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
