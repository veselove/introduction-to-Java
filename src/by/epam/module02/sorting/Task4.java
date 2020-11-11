package by.epam.module02.sorting;

/*
Сортировка обменами. Дана последовательность чисел a1<=a2..<=an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1) . Если ai>a(i+1), то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task4 {

	public static void main(String[] args) {
		
		int[] nums = { 3, 9, 0, 7, -13, 9, 11, 21, -7, 17, 5, 19, 1, 15 };

		System.out.println("Original array: ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println("\n" + "Exchange sort (Ascending): ");
		
		int exchangeCounter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
					exchangeCounter++;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print("\n" + "Number of permutations: " + exchangeCounter);

	}

}
