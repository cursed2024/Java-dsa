import java.util.*;
class SumOfNatrualNumbers{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n =sc.nextInt();
    int sum =0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    System.out.print("The sum of first "+ n +" natural numbers is: "+ sum);
    sc.close();
    }
}