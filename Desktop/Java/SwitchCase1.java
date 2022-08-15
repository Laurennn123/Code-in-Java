import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner numm = new Scanner(System.in);
        System.out.print("Enter first number        :");
        double nu1 = numm.nextDouble();
        System.out.print("Enter second number       :");
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
    }
}
