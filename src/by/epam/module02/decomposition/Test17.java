package by.epam.module02.decomposition;

/*
* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
* Сколько таких действий надо произвести, чтобы получился нуль?
* Для решения задачи использовать декомпозицию.
 */

public class Test17 {
	
	public static void main(String[] args) {

        int n = 30;
        
        System.out.println("Number: " + n);
        
        System.out.println("Number of iterations: " + counterToZero(n));
    }
	
    private static int counterToZero(int num) {
    	
        int counter = 0;
        int temp = 1;
        
        while (temp > 0) {
            num -= sumOfDigits(num);
            temp = num;
            counter++;
        }
        
        return counter;
    }
    
    private static int sumOfDigits(int num) {
    	
        int digit;
        int sum = 0;
        
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        return sum;
    }

}
