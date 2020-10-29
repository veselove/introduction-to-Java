package by.epam.module01.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Task2 {
	
    public static void main (String[] args) throws IOException {
    	    	
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        
        System.out.println("Enter the number a");
        String numA = reader.readLine();
        double a = Double.parseDouble(numA);
        
        System.out.println("Enter the number b");
        String numB = reader.readLine();
        double b = Double.parseDouble(numB);
        
        System.out.println("Enter the number c");
        String numC = reader.readLine();
        double c = Double.parseDouble(numC);
        
		double result = (b + (Math.sqrt(b * b + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.print("Result: " + result);
	}
}