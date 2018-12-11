
import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cels,fahrn;
        System.out.println("Celcius = ");
        cels = input.nextDouble();

        fahrn = 1.8 * cels +32;
        System.out.println("Fahrenheit : "+fahrn);


    }




}
