import java.util.Scanner;

public class DateIs {
    public static void main(String[] args) {
        int date;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date:");
        date = scanner.nextInt();
        System.out.println("Enter month:");
        month = scanner.nextInt();
        if ((date<20)&&(month<3)||(date>20)&&(month>6)){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
