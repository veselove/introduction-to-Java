package by.epam.module02.sorting;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
то продвигаются на один элемент вперед. Если a(i)>a(i+1) , то производится перестановка и сдвигаются
на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {

	public static void main(String[] args) {

		int[] nums = { 1, -15, 0, 3, 9, -7, 21, 4, -4, 0 };

		int i = 0;

		while (i <= nums.length - 2) {
			if (nums[i] <= nums[i + 1])
				i++;
			else if (nums[i] > nums[i + 1]) {
				if (i == 0) {
					int tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
					i++;
				} else {
					int tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
					i--;
				}
			}
		}

		for (i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
