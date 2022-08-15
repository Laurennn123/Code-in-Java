public class FinalExam {
    public static void main(String[] args) {
        alldivisiblebyseven();
        Totalsum();
    }
    public static void alldivisiblebyseven(){
        System.out.println("This Program is to find sum of all integers between 100 and 200 that are divisible by 7");
        for (int sum=100; sum<200; sum++){
            if (sum%7==0)
                System.out.println("All of greather than 100 and less than 200 divisible by 7: "+sum);
        }
    }
    public static void Totalsum(){
        int totalsum=0;
        for (int sumtotal=100; sumtotal<=200; sumtotal++){
            if(sumtotal%7==0)
                totalsum = totalsum + sumtotal;
        }
        System.out.println("Total sum of all integers between 100 and 200 are "+ totalsum);
    }

}
