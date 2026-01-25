import java.util.*;
//~~~~output~~~~~
// Enter the number
// 156484
// counts : 6
// Enter the number
// 0
// counts : 1
// Enter the number
// -4451
// Enter positive Number

class NumberCounter{
    public static void NumberCalculator(int number){
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        if (number < 0) {
            System.out.println("Enter positive Number");
            return;
        }
        while(number>0){
            number=number/10;
            count = count +1;
        }
        System.out.println("counts : "+count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        NumberCalculator(number);
        System.out.println("Enter the number");
        int number1 = sc.nextInt();
        NumberCalculator(number1);
        System.out.println("Enter the number");
        int number2 = sc.nextInt();
        NumberCalculator(number2);
        sc.close();
    }
}