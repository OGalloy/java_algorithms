package lesson2;

public class InsertionSort {
    public int[] insertionSort(int[] data) {
        for (int i=1; i < data.length; i++) {
            for (int j=i; j > 0; j-- ) {
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
