import java.util.Scanner;
public class IntToRoman {
    public static void main(String[] args) {
        Scanner roman = new Scanner(System.in);
        System.out.print("Input integer   :");
        int rom = roman.nextInt();
        //M=1000 D=500 C=100 L=50 X=10 V=5 I=1
        System.out.print("Roman Number    :");
        while(rom>0){
            if(rom>=1000){
                System.out.print("M");
                rom = rom - 1000;
            } else if(rom>=500){
                System.out.print("D");
                rom = rom -500;
            } else if(rom>=100){
                System.out.print("C");
                rom = rom - 100;
            } else if(rom>=50){
                System.out.print("L");
                rom = rom - 50;
            } else if(rom>=10){
                System.out.print("X");
                rom = rom - 10;
            } else if(rom>=5){
                System.out.print("V");
                rom = rom - 5;
            } else if(rom>=1){
                System.out.print("I");
                rom = rom - 1;
            }
        }
    }
}
