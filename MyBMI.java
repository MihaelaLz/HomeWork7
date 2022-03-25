import java.util.Scanner;

public class MyBMI {
    public static void main(String[] args) {
        System.out.println("Please enter your weight in kg: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.print("Please enter your height in m: ");
        float height = scanner.nextFloat();
        float bmi = (weight)/(height*height);
        float result = (weight)/(height*height);
        System.out.println("Your BMI is:" + result);

        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }

}


