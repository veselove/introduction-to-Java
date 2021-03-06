package by.epam.module04.simple_class.task8;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 */

public class Main {

	public static void main(String[] args) {

		final int databaseSize = 10;

		Customer[] customers = new Customer[databaseSize];
		
		customers[0] = new Customer (9315, "Загорский", "Сергей", "Валерьевич", "проспект Пушкина, 50-129",  "3652676984631482", "98456672135642116429");
		customers[1] = new Customer (6801, "Денисевич", "Светлана", "Николаевна", "улица Космонавтов 15-26",  "9176485852121589", "89246857346958342558");
		customers[2] = new Customer (7245, "Давидович", "Мария", "Владимировна", "улица Долгобродская 4-12",  "6915734688235454", "71895725469856325225");
		customers[3] = new Customer (4461, "Жук", "Денис", "Геннадьевич", "улица Плеханова 84-217",  "1587693248907623", "91567238973544389274");
		customers[4] = new Customer (6015, "Кузнецов", "Владимир", "Петрович", "улица Сурганова 62-90",  "8348969437562393", "85349786542376290867");
		customers[5] = new Customer (2539, "Бельская", "Валентина", "Анатольевна", "проспект Рокоссовского 2-81",  "5435534623667872", "77238943676463789046");
		customers[6] = new Customer (7598, "Коваленко", "Николай", "Юрьевич", "переулок Чижевских 48-12",  "2458969536842356", "74643567744585345913");
		customers[7] = new Customer (8460, "Новик", "Анастасия", "Денисовна", "улица Ольшевского 45-107",  "7818245878674534", "75896654435634734374");
		customers[8] = new Customer (3351, "Королёва", "Ирина", "Николаевна", "улица Уборевича 88-169",  "4821977862027566", "91547545386432347457");
		customers[9] = new Customer (9152, "Мороз", "Дмитрий", "Викторович", "Улица Академическая 4-18",  "5435575343467654", "90654732354653645856");
		
		System.out.println("Список покупателей, отсортирован по фамилиям в алфавитном порядке:\n");

		CustomerLogic.abcSortingSurnames(customers);

		CustomerLogic.viewCustomersFromCardRange(customers);
	}

}
