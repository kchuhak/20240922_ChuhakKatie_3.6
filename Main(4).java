import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // prompt user to enter height in feet and inches
        System.out.print("Enter height (feet): ");
        int feet = input.nextInt();
        System.out.print("Enter height (inches): ");
        int inches = input.nextInt();

        // convert height to total inches
        int totalHeightInInches = (feet * 12) + inches;

        // calculate BMI
        double bmi = (weight * 703) / (totalHeightInInches * totalHeightInInches);

        // display the BMI result
        System.out.printf("BMI is %.2f%n", bmi);

        // check if BMI is in the normal range
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}