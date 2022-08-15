import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gradee;
        do {
            System.out.print("Input Grade in Percentage(%)   :");
            int grade = input.nextInt();
            double a = 1.00, b = 1.25, c = 1.50, d = 1.75, e = 2.00, f = 2.25, g = 2.50, h = 2.75, i = 3.00, j = 4.00, k = 5.00;
            if (grade > 96 && grade < 101) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (a) + "\nRemarks                        :Excellent");
            } else if (grade >= 93 && grade < 97) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (b) + "\nRemarks                        :Excellent");
            } else if (grade >= 90 && grade < 94) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (c) + "\nRemarks                        :Very Good");
            } else if (grade >= 87 && grade < 91) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (d) + "\nRemarks                        :Very Good");
            } else if (grade >= 84 && grade < 88) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (e) + "\nRemarks                        :Good");
            } else if (grade >= 82 && grade < 85) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (f) + "\nRemarks                        :Good");
            } else if (grade >= 79 && grade < 83) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (g) + "\nRemarks                        :Fair");
            } else if (grade >= 77 && grade < 80) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (h) + "\nRemarks                        :Fair");
            } else if (grade >= 74 && grade < 78) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (i) + "\nRemarks                        :Passed");
            } else if (grade >= 69 && grade < 75) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (j) + "\nRemarks                        :Conditional");
            } else if (grade >= 50 && grade < 70) {
                System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (k) + "\nRemarks                        :Failed");
            } else {
                System.out.println("ERROR! Invalid input grade");
            }
            System.out.print("Input another grade?[Y/N]:   ");
            gradee = input.next();
        } while (gradee.equalsIgnoreCase("Y"));
    }
}