package by.epam.module02.sorting;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Образовать из них новую
последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task2 {

	public static void main(String[] args) {

        int[] nums1 = {2, 6, 6, 10, 14, 14, 16, 18, 21};
        int[] nums2 = {1, 3, 5, 6, 7, 9, 11, 11, 13, 14, 17, 17, 19, 21, 23, 23};
        for (int i = 0; i < nums1.length; i++) System.out.print(nums1[i] + " ");
        System.out.println();
        for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + " ");
        System.out.println();
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < nums1.length + nums2.length; i++) {  //23
            if (counter1 == nums1.length) {
                System.out.print(nums2[counter2] + " ");
                counter2++;
            }
            else if (counter2 == nums2.length) {
                System.out.print(nums1[counter1] + " ");
                counter1++;
            }
            else if (nums1[counter1] < nums2[counter2]) {
                System.out.print(nums1[counter1] + " ");
                counter1++;
            }
            else {
                System.out.print(nums2[counter2] + " ");
                counter2++;
            }
        }

	}

}
