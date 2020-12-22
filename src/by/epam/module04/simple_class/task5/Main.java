package by.epam.module04.simple_class.task5;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/

public class Main {

	public static void main(String[] args) {

		DecimalCounter counter = new DecimalCounter();

		System.out.println(counter.getCurrent());

		counter.increment();

		System.out.println(counter.getCurrent());

		counter.decrement();
		counter.decrement();

		System.out.println(counter.getCurrent());

		counter = new DecimalCounter(40, 50);

		counter.increment();

		System.out.println(counter.getCurrent());

		counter.decrement();

		System.out.println(counter.getCurrent());

	}
}
