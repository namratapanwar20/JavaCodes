import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks scored in 5 subjects (out of 100)");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float m5=sc.nextFloat();

        float sum=(m1+m2+m3+m4+m5);
        float percentage=(sum/500)*100;

        System.out.println("Overall Percentage : "+ percentage);
    }
}
