package by.epam.module02.sorting;

/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...bm,
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm  в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {

	public static void main(String[] args) {

		int[] nums1 = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] nums2 = { 1, 5, 9, 15, 19, 20, 20, 20, 25, 29, 35, 39 };
		
		int count1 = 0;
		int count2 = 0;
		int d = -1;
		
		for (int i = 0; i < nums1.length + nums2.length; i++) {
			if (count2 == nums2.length)
				break;
			else if (count1 == nums1.length) {
				d++;
				System.out.print(d + " ");
			} else if (nums1[count1] <= nums2[count2]) {
				count1++;
				d++;
			} else if (nums1[count1] > nums2[count2]) {
				count2++;
				d++;
				System.out.print(d + " ");
			}
		}
		
	}

}
