import java.util.*;
public class SwitchConcept {
    public static void main(String[] args) {
         int num1 ;
        int num2 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        char operator;
        System.out.print("Enter an operator : ");
        operator = scanner.next().charAt(0);
        switch(operator){
            case '+':
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            break;
            case '-':
            int difference = num1 - num2;
            System.out.println("Difference: " + difference);
            break;
            case '*':
            int product = num1 * num2;
            System.out.println("Product: " + product);
            break;
            case '/':
            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
            break;
            default:
            System.out.println("Invalid operator");
        
    }
    }
    }
