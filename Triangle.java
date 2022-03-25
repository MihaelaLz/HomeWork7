import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x: ");
        x = scanner.nextInt();
        System.out.println("Please enter y: ");
        y = scanner.nextInt();
        System.out.println("Please enter z: ");
        z = scanner.nextInt();

        if ((x==y)&&(x==z)&&(y==z)){
            System.out.println("The triangle is: Equilateral");

        }
        else if ((x==y)&&(z!=x)&&(z!=y)){
            System.out.println("The triangle is: Isosceles");
        }
        else if ((x==z)&&(y!=x)&&(y!=z)){
            System.out.println("The triangle is: Isosceles");
        }
        else if((y==z)&&(x!=z)&&(x!=y)){
            System.out.println("The triangle is: Isosceles");

        }
        else{
            System.out.println("The triangle is: Scalene");
        }

    }


}
