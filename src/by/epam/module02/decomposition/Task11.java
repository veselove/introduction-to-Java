package by.epam.module02.decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task11 {

	public static void main(String[] args) {

        int a = 1234567;
        int b = 123456;
        
        compareTheNumberOfDigits(a, b);
    }
    private static int countTheDigits (int n) {
    	
        int count = (n == 0) ? 1 : 0;
        
        while (n != 0) {
            count++;
            n /= 10;
        }
        
        return count;
    }
    private static void compareTheNumberOfDigits(int a, int b) {
    	
    	System.out.println(a + " and " + b);
    	
        if (countTheDigits(a) > countTheDigits(b)) {
            System.out.println("The first number has more digits than the second");
        }
        
        if (countTheDigits(a) < countTheDigits(b)) {
            System.out.println("The second number has more digits than the first");
        }
        
        if (countTheDigits(a) == countTheDigits(b)) {
            System.out.println("The first and second numbers have the same number of digits");
        }

	}

}
