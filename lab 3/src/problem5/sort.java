package problem5;

public class sort {
	public static <E> void swap(E [] array, int i, int j) {
		E temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	public static <E extends Comparable<E>> void quickSort(E [] array, int low, int high) {
		if(low < high) {
			E pivot = array[high];
			int i = low - 1;
			for(int j = low; j <= high - 1; j++) {
				if(pivot.compareTo(array[j]) == 1) {
					i++;
					swap(array,i,j);
				}
			}
			swap(array, i + 1, high);
			quickSort(array,low,i);
			quickSort(array, i + 2, high);
		}
	}
	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length; j++) {
				if(array[j - 1].compareTo(array[i]) == 1) {
					swap(array,i,j - 1);
				}
			}
		}
	}
}
