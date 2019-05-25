package com.hugeyurt.sort;
import com.hugeyurt.sort.SelectionSort;
public class SortTest extends SelectionSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []testArray1= {5,7,8,6,2,4,1,3,0,9};
		int []selectionSorts=SelectionSort.SelectionSort(testArray1);
		for(int selectionSort:selectionSorts)
			System.out.print(selectionSort+"	");
		System.out.println();
		int []testArray2= {5,7,8,6,2,4,1,3,0,9};
		int []bubbleSorts=BubbleSort.bubblesort(testArray2);
		for(int bubbleSort:bubbleSorts)
			System.out.print(bubbleSort+"	");
		System.out.println();
//		int []testArray3= {5,7,8,6,2,4,1,3,0,9};
//		int []insertSorts=InsertSort.insertsort(testArray3);
//		for(int insertSort:insertSorts)
//			System.out.print(insertSort+"	");
//		System.out.println();
		int []testArray4= {5,7,8,6,2,4,1,3,0,9};
		int []quickSorts=QuickSort.quicksort(testArray4, 0, testArray4.length-1);
		for(int quickSort:quickSorts)
			System.out.print(quickSort	+"	");
	}
}
