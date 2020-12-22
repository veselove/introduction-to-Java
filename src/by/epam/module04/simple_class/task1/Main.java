package by.epam.module04.simple_class.task1;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */

public class Main {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1(7, 8);
		test1.print();
		System.out.println("sum = " + test1.getSum() + 
				"\nmax = " + test1.max());
		test1.setA(18);
		test1.print();
	}
}
