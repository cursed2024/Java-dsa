import java.util.*;
class sumOfOddNumbers{

    public static void sumCalculator(int n){
        int sum=0;
        System.out.print("Odd numbers are :");
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("\nThe sum of odd numbers up to " + n + " is: " + sum);
         
    }

    public static void main(String args[]){
        System.out.print("Enter a number to calculate the sum of odd numbers up to that number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumCalculator(n);
        sc.close();
    }
    
}
