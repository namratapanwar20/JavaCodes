import java.util.Scanner;
public class converter {
    public static void main(String[] args){
        System.out.print("Enter distance (in km) : ");
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        System.out.println("Distance (in miles) : "+(length*0.614));

    }
}
