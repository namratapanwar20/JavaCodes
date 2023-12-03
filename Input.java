import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.print("Enter your name : ");
        String s=sc.next();
        System.out.println("Entered number is : "+ a);
        System.out.println("Name : "+s);
    }
}
