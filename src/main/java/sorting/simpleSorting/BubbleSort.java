package sorting.simpleSorting;
import util.Util;
import sorting.AbstractSorting;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array == null || array.length == 0) {
			return;
		}
		if (leftIndex < 0 || rightIndex >= array.length || leftIndex >= rightIndex){
			return;
		}

		boolean swapped;
		for (int i = leftIndex; i < rightIndex; i++) {
			swapped = false;
			for (int j = leftIndex; j < rightIndex - (i - leftIndex); j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					Util.swap(array, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				return;
			}
		}
	}
}