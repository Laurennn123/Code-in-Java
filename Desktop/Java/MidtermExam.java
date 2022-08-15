import java.util.Scanner;
public class num2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tryAgain;
        do {
            System.out.print("Enter integer(from 1 to 3000)  :    ");
            int numInput = scan.nextInt();
            int thousandsPlace = numInput / 1000;
            int hundredsPlace = (numInput - thousandsPlace * 1000) / 100;
            int tensPlace = (numInput - ((thousandsPlace * 1000) + (hundredsPlace * 100))) / 10;
            int onesPlace = numInput - ((thousandsPlace * 1000) + (hundredsPlace * 100) + (tensPlace * 10));
            String qw[] = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
            String ww[] = {" ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hd = " Hundred ";
            String th = " Thousand ";
            if (numInput <= 3000) {
                System.out.print("You entered a four digit number. \nThe number is " + (numInput) + " The number in words: ");
                if (thousandsPlace != 0) {
                    System.out.print(qw[thousandsPlace] + th + " ");
                }
                if (hundredsPlace != 0) {
                    System.out.print(qw[hundredsPlace] + hd + " ");
                }
                if (tensPlace != 0) {
                    System.out.print(ww[tensPlace] + " ");
                }
                if (onesPlace != 0) {
                    System.out.println(qw[onesPlace]);
                }
                System.out.print("\nEquivalent in Roman numeral  :");
                printRoman(numInput);
            } else {
                System.out.println("input out of range!");
            }
            System.out.print("\nInput another number?[Y/N]:  ");
            tryAgain = scan.next();
        } while(tryAgain.equalsIgnoreCase("Y"));
    }

    static void printRoman(int numInput) {
        while (numInput > 0) {
            if (numInput >= 1000) {
                System.out.print("M");
                numInput = numInput - 1000;
            } else if (numInput >= 500) {
                System.out.print("D");
                numInput = numInput - 500;
            } else if (numInput >= 100) {
                System.out.print("C");
                numInput = numInput - 100;
            } else if (numInput >= 50) {
                System.out.print("L");
                numInput = numInput - 50;
            } else if (numInput >= 10) {
                System.out.print("X");
                numInput = numInput - 10;
            } else if (numInput >= 5) {
                System.out.print("V");
                numInput = numInput - 5;
            } else if (numInput >= 1) {
                System.out.print("I");
                numInput = numInput - 1;
            }
        }
    }
}