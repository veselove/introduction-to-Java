package by.epam.module04.simple_class.task6;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
*/

public class Main {

	public static void main(String[] args) {

		Time time1 = new Time(00, 00, 00);

		System.out.println(print(time1));

		System.out.println("Установка времени:");
		time1 = new Time(12, 30, 17);

		System.out.println(print(time1));

		System.out.println("Изменение отдельного поля (минуты: 30 -> 45):");
		time1.setMinutes(45);

		System.out.println(print(time1));

		System.out.println("Проверка допустимости вводимиого значения (вводим 5:60:60):");
		time1.setHours(5);
		time1.setMinutes(60);
		time1.setSeconds(60);

		System.out.println(print(time1));

		System.out.println("Установка времени:");
		time1 = new Time(5, 00, 00);

		System.out.println(print(time1));

		System.out.println("Режим 1: прибавление времени +12:30:15");
		System.out.println(print(adjustTime(time1, 12, 30, 15, 1)));

		System.out.println("Режим 2: вычитание времени -23:40:45");
		System.out.println(print(adjustTime(time1, 23, 40, 45, 2)));

	}

	public static String print(Time time1) {

		StringBuilder builder = new StringBuilder();

		builder.append(time1.getHours() + ":");

		if (time1.getMinutes() < 10)
			builder.append("0" + time1.getMinutes() + ":");
		else
			builder.append(time1.getMinutes() + ":");

		if (time1.getSeconds() < 10)
			builder.append("0" + time1.getSeconds());
		else
			builder.append(time1.getSeconds());
		return builder.toString();
	}

	public static Time adjustTime(Time time, int hour, int min, int sec, int mode) {

		int totalSec1 = time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
		int totalSec2 = hour * 3600 + min * 60 + sec;
		int result = 0;
		if (mode == 1) {
			result = totalSec1 + totalSec2;
		}
		if (mode == 2) {
			result = totalSec1 - totalSec2;
			if (result < 0)
				result = -result;
		}

		hour = result / 3600;
		min = (result - hour * 3600) / 60;
		sec = result - hour * 3600 - min * 60;

		if (mode == 2 && totalSec1 - totalSec2 < 0)
			hour = -hour;

		time.setHours(hour);
		time.setMinutes(min);
		time.setSeconds(sec);

		return time;
	}

}