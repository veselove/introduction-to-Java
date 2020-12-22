package by.epam.module04.simple_class.task5;

import java.util.Random;

public class DecimalCounter {

	private int counter;
	private int max;
	private int min;

	public DecimalCounter() {
		
		this.min = 0;
		this.max = 100;
		this.counter = 0;
		
	}

	public DecimalCounter(int min, int max) {
		
		this.min = min;
		this.max = max;
		Random rnd = new Random();
		this.counter = rnd.nextInt((max - min) + 1) + min;
		
	}

	public int getCurrent() {
		
		return counter;
	}

	public void increment() {
		
		counter++;
		if (counter > max)
			counter = min;

	}

	public void decrement() {
		
		counter--;
		if (counter < min)
			counter = max;

	}

}
