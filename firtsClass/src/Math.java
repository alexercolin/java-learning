import java.util.Scanner;

public class Math {
    public static void main(String[] args){
        int number;

        System.out.println("Inform a number to factorial calculation: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while(i<= number){
            factorial = factorial *i;
            i++;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

