import java.util.*;

class averageOf3Numbers{

    public static void averageCalculator(double a, double b, double c){
        double average=(a+b+c)/3;
        System.out.println("The average of the three numbers is: " + average);

    }
    public static void main(String args[]){
        System.out.println("Enter three numbers to calculate their average:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter second number:");
        double num2=sc.nextDouble();
        System.out.print("Enter third number:");
        double num3=sc.nextDouble();

        averageCalculator(num1, num2, num3);
        sc.close(); 
    }
    
}