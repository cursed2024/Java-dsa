import java.util.*;
class CountNumbers{

    public static void countNumbers(){
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        int choice;

        do{
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if(number > 0){
                positiveCount++;
            } else if(number < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to enter another number? (1 for Yes / 0 for No): ");
            choice = sc.nextInt();
        }while(choice == 1);
        displayCounts(positiveCount, negativeCount, zeroCount);
        sc.close();
    }

    public static void displayCounts(int positiveCount, int negativeCount, int zeroCount){
        System.out.println("--------------------------");
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
        System.out.println("--------------------------");
    }

    public static void main(String args[]){
        countNumbers();
    }
}