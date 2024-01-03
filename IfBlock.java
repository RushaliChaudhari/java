import java.util.Scanner;

public class IfBlock{
    
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        
        if(age>=18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("you are kid");
        }
    }
}