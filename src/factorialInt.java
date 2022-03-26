import java.util.*;
public class factorialInt {
    public static void main(String[]args){
        int positive = 0;
        System.out.println("Enter Positive Integer");
        Scanner input = new Scanner(System.in);
        int factor = input.nextInt();
       while(factor >0){
           positive = positive + factor;
           factor = factor -1;

        }
        System.out.println("The Result is :"+ positive);
    }
}
