import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayBuffered {
    public static void main(String[] args) throws IOException {
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
}