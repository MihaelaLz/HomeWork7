import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter your number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.print("The number is: Even");

        }
        else {
            System.out.print("The number is: Odd");
        }




    }
}

