package app.data;

import java.util.Scanner;

public class DataProvider {

    public int getTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature from -10 to +35 degrees Celcius: ");
        return scanner.nextInt();
    }
}
