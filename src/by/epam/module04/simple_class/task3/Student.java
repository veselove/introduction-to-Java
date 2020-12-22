package by.epam.module04.simple_class.task3;

public class Student {

	private String fullName;
	private String groupNumber;
	private int[] scores;

	public Student(String fullName, String groupNumber, int[] scores) {

		this.fullName = fullName;
		this.groupNumber = groupNumber;
		this.scores = scores;

	}

	String getName() {

		return fullName;

	}

	String getGroupNumber() {
		return groupNumber;
	}

	boolean isExcellentStudent() {

		int[] scores = this.scores;

		boolean isExcellent = true;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 9)
				isExcellent = false;
		}
		return isExcellent;

	}

}
