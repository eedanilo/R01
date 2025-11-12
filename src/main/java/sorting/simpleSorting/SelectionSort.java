package sorting.simpleSorting;
import util.Util;
import sorting.AbstractSorting;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array == null || array.length == 0){
			return;
		}
		if (leftIndex < 0 || rightIndex >= array.length || leftIndex >= rightIndex){
			return;
		}

		for (int i = leftIndex; i < rightIndex; i++){
			int min = i;
			for (int j = i + 1; j <= rightIndex; j++){
				if (array[j].compareTo(array[min]) < 0){
					min = j;
				}
			}
		if (i != min){
			Util.swap(array, min, i);
		}
		}
	}
}