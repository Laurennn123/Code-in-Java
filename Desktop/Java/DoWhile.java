import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        //Do-while loop
        int e;
        e=7;
        do {
            System.out.println("The "+e+" days of the week");
            break;
        } while(e>1);
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int b=0; b<weeks.length; b++){
            System.out.println(weeks[b]);
        }
    }
}
