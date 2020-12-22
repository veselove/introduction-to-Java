package by.epam.module04.simple_class.task3;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[10];
		{

			students[0] = new Student("Иванов А.П.", "106202", new int[] { 9, 9, 9, 7, 8 });
			students[1] = new Student("Адамович В.С.", "106212", new int[] { 8, 7, 9, 10, 8 });
			students[2] = new Student("Лазовский Н.Д.", "106422", new int[] { 9, 7, 7, 8, 6 });
			students[3] = new Student("Радченко В.М.", "106112", new int[] { 7, 9, 7, 10, 9 });
			students[4] = new Student("Рожко С.К.", "106112", new int[] { 9, 9, 9, 10, 9 });
			students[5] = new Student("Прокопчук Г.Е.", "106232", new int[] { 8, 8, 7, 8, 7 });
			students[6] = new Student("Корбут В.К.", "106312", new int[] { 9, 8, 9, 7, 9 });
			students[7] = new Student("Новиков Д.П.", "106102", new int[] { 8, 9, 9, 10, 8 });
			students[8] = new Student("Савицкий К.Б.", "106322", new int[] { 9, 10, 9, 10, 9 });
			students[9] = new Student("Гончаров С.Н.", "106242", new int[] { 8, 6, 8, 9, 7 });

		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].isExcellentStudent())
				System.out.println(students[i].getName() + ", " + students[i].getGroupNumber());
		}

	}
}
