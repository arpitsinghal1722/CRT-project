
import java.util.Scanner;
public class validateAgeEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age===");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Welcome for Voting");
        }else{
            System.out.println("Invalid age");
        }
    }
}