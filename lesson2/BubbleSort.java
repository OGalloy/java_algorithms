//Bubble sort
package lesson2;

public class BubbleSort {
	public  int[] bubbleSort(int[] data) {
		for (int i = 0; i<data.length; i++) {
			for (int j = 1; j < data.length; j++) {
				if (data[j] < data[j-1]) {
					int temp = data[j];
					data[j] = data[j-1];
					data[j - 1] = temp;
				}
			}
		}
		return data;
	}
}