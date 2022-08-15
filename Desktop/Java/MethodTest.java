import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MethodTest {
    public static void main(String[] args)throws Exception {
        ActivityTest1();
        ActivityTest2();
        ActivityTest3();
        ActivityTest4();
        ActivityTest5();
    }
    public static void Activity1(double sq){
        double inch = 3.00; double feet = 10; double meter =2.28;
        System.out.println("\t\t"+(sq/meter)+" sq.m.");
        System.out.println("\t\t"+(sq/inch)+" sq.in.");
        System.out.println("\t\t"+(sq/feet)+" sq.ft.");
    }
    public static void Activity1a(double peri){
        double inch = 3.00; double feet = 10; double meter =2.28;
        System.out.println("\t\t\t "+(peri/meter)+" m.");
        System.out.println("\t\t\t "+(peri/inch)+" in.");
        System.out.println("\t\t\t "+(peri/feet)+" ft.");
    }
    public static void ActivityTest1(){
        System.out.println("Activity 1 Test Start");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Length of Rectangle:");
        double length= scan.nextDouble();
        System.out.print("Enter Width of Rectangle:");
        double width= scan.nextDouble();
        double area = length * width;
        System.out.println("Area =  "+(area)+" sq.cm.");
        double sq = area;
        Activity1(sq);
        double perimeter = (2*length) +(2*width);
        System.out.println("Perimeter =  "+(perimeter)+" cm.");
        double peri = perimeter;
        Activity1a(peri);
    }
    public static void Activity2(){
        Scanner scanner=new  Scanner(System.in);
        System.out.print("Input time in seconds    :");
        int seconds= scanner.nextInt();;
        int Sec = seconds/3600;
        int Secc = seconds %3600;
        int Seccc = Secc/60;
        int Secccc = Secc % 60;
        System.out.println("The input time in seconds is equivalent to: "+(Sec)+" Hours "+(Seccc)+" Minutes "+(Secccc)+" Seconds ");
    }
    public static void ActivityTest2(){
        System.out.println("\nActivity 2 Test Start");
        Scanner scanner=new  Scanner(System.in);
        System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");
        Activity2();
    }
    public static void Activity3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Grade in Percentage(%)   :");
        int grade = input.nextInt();
        double a = 1.00, b = 1.25, c = 1.50, d = 1.75, e = 2.00, f = 2.25, g = 2.50, h = 2.75, i = 3.00, j = 4.00, k = 5.00;
        if (grade > 96 && grade < 101) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (a) + "\nRemarks                        :Excellent");
        } else if (grade > 93 && grade < 97) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (b) + "\nRemarks                        :Excellent");
        } else if (grade > 90 && grade < 94) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (c) + "\nRemarks                        :Very Good");
        } else if (grade > 87 && grade < 91) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (d) + "\nRemarks                        :Very Good");
        } else if (grade > 84 && grade < 88) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (e) + "\nRemarks                        :Good");
        } else if (grade > 82 && grade < 85) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (f) + "\nRemarks                        :Good");
        } else if (grade > 79 && grade < 83) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (g) + "\nRemarks                        :Fair");
        } else if (grade > 77 && grade < 80) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (h) + "\nRemarks                        :Fair");
        } else if (grade > 74 && grade < 78) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (i) + "\nRemarks                        :Passed");
        } else if (grade > 69 && grade < 75) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (j) + "\nRemarks                        :Conditional");
        } else if (grade > 60 && grade < 70) {
            System.out.println("Input Grade in Percentage(%)   :" + (grade) + "\nEquivalent Numerical Grade     :" + (k) + "\nRemarks                        :Failed");
        } else if (grade < 50) {
            System.out.println("Invalid input Grade");
        }
        System.out.println("\nActivity 3 no.2");
        System.out.print("Enter an Integer Number:");
        int integerr = input.nextInt();
        if (integerr < 10) {
            System.out.println("You entered a one digit number. \nThe number is " + (integerr) + "");
        } else if (integerr < 100) {
            System.out.println("You entered a two digit number. \nThe number is " + (integerr) + "");
        } else if (integerr < 1000) {
            System.out.println("You entered a three digit number. \nThe number is " + (integerr) + "");
        } else if (integerr < 10000) {
            System.out.println("You entered a four digit number. \nThe number is " + (integerr) + "");
        }
        System.out.println("\nActivity 3 no.3");
        System.out.print("Enter integer(from 1 to 3000):");
        int numInput = input.nextInt();
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
        }
    }
    public static void ActivityTest3(){
        System.out.println("\nActivity 3 Test Start");
        Activity3();
    }
    public static void Activity4(){
        Scanner numm = new Scanner(System.in);
        System.out.print("Enter first number:");
        double nu1 = numm.nextDouble();
        System.out.print("Enter second number:");
        double nu2 = numm.nextDouble();
        System.out.print("Enter an operator(+,-,*,/):");
        char op = numm.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(""+(nu1)+"+"+(nu2)+" = "+(nu1 + nu2));
                break;
            case '-':
                System.out.println(""+(nu1)+"-"+(nu2)+" = "+(nu1 - nu2));
                break;
            case '*':
                System.out.println(""+(nu1)+"*"+(nu2)+" = "+(nu1 * nu2));
                break;
            case '/':
                System.out.println(""+(nu1)+"/"+(nu2)+" = "+(nu1 / nu2));
                break;
            default:
                System.out.println("You have entered wrong operator!");
        }
        System.out.println("\nActivity 4 no.2");
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char let =letter.next().charAt(0);
        switch (let){
            case 'A': System.out.println("A is a Vowel");break;
            case 'a': System.out.println("A is a Vowel");break;
            case 'B': System.out.println("B is a Consonant");break;
            case 'b': System.out.println("b is a Consonant");break;
            case 'C': System.out.println("C is a Consonant");break;
            case 'c': System.out.println("c is a Consonant");break;
            case 'D': System.out.println("D is a Consonant");break;
            case 'd': System.out.println("d is a Consonant");break;
            case 'E': System.out.println("E is a Vowel");break;
            case 'e': System.out.println("e is a Vowel");break;
            case 'F': System.out.println("F is a Consonant");break;
            case 'f': System.out.println("f is a Consonant");break;
            case 'G': System.out.println("G is a Consonant");break;
            case 'g': System.out.println("g is a Consonant");break;
            case 'H': System.out.println("H is a Consonant");break;
            case 'h': System.out.println("h is a Consonant");break;
            case 'I': System.out.println("I is a Vowel");break;
            case 'i': System.out.println("i is a Vowel");break;
            case 'J': System.out.println("J is a Consonant");break;
            case 'j': System.out.println("j is a Consonant");break;
            case 'K': System.out.println("K is a Consonant");break;
            case 'k': System.out.println("k is a Consonant");break;
            case 'L': System.out.println("L is a Consonant");break;
            case 'l': System.out.println("l is a Consonant");break;
            case 'M': System.out.println("M is a Consonant");break;
            case 'm': System.out.println("m is a Consonant");break;
            case 'N': System.out.println("N is a Consonant");break;
            case 'n': System.out.println("n is a Consonant");break;
            case 'O': System.out.println("O is a Vowel");break;
            case 'o': System.out.println("o is a Vowel");break;
            case 'P': System.out.println("P is a Consonant");break;
            case 'p': System.out.println("p is a Consonant");break;
            case 'Q': System.out.println("Q is a Consonant");break;
            case 'q': System.out.println("q is a Consonant");break;
            case 'R': System.out.println("R is a Consonant");break;
            case 'r': System.out.println("r is a Consonant");break;
            case 'S': System.out.println("S is a Consonant");break;
            case 's': System.out.println("s is a Consonant");break;
            case 'T': System.out.println("T is a Consonant");break;
            case 't': System.out.println("t is a Consonant");break;
            case 'U': System.out.println("U is a Vowel");break;
            case 'u': System.out.println("u is a Vowel");break;
            case 'V': System.out.println("V is a Consonant");break;
            case 'W': System.out.println("W is a Consonant");break;
            case 'w': System.out.println("w is a Consonant");break;
            case 'X': System.out.println("X is a Consonant");break;
            case 'x': System.out.println("x is a Consonant");break;
            case 'Y': System.out.println("Y is a Consonant");break;
            case 'y': System.out.println("y is a Consonant");break;
            case 'Z': System.out.println("Z is a Consonant");break;
            case 'z': System.out.println("z is a Consonant");break;
            default: System.out.println("Input is not an alphabet!");
        }
    }
    public static void ActivityTest4(){
        System.out.println("\nActivity 4 Test Start");
        Activity4();
    }
    public static void Activity5() throws IOException {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
        System.out.println("\nActivity 5 no.2");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        double [] number = new double [10];
        for (int i=0; i<number.length; i++){
            System.out.print("Enter number no."+(1+i)+":");
            number[i]=Double.parseDouble(buff.readLine());
        }
        double greatest = number[0];
        for (int i= 1; i <number.length; i++){
            greatest = Math.max( greatest , number[i]);
        }
        System.out.println("\nThe greatest value from inputs is = " + greatest );

    }
    public static void ActivityTest5() throws IOException {
        System.out.println("\nActivity 5 Test Start");
        Activity5();
    }
}

