import java.util.Scanner;
public class check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        boolean b=sc.hasNextInt();
        if(b){
           System.out.println("Entered number is integer");
        }else {
            System.out.println("Entered number is not integer");
        }
    }
}
