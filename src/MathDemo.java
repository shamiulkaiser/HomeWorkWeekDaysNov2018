import java.util.Scanner;
public class MathDemo {

    public static void main(String[] args) {



        // num1 and num2 will use only these numbers
        //num1 = 20;
        //num2 = 10;
// this will allow user input line 13-18

        Scanner input = new Scanner(System.in);
        int num1, num2,result;
        System.out.println("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter second number :");
        num2 = input.nextInt();

        result = num1+num2;
        System.out.println("Sum="+result);
        result = num1-num2;
        System.out.println("Sub="+result);
        result = num1*num2;
        System.out.println("Mult="+result);
        result = num1/num2;
        System.out.println("Divide="+result);
        result = num1%num2;
        System.out.println("Remainder="+result);





    }







}
