import java.util.*;

class  conditonal{
    public static void main(String args[]){
        System.out.println("*Check if you are eligible to vote or not*");
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}