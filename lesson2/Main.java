//heap sort
package lesson2;
//
public class Main {
    public static void main(String[] args) {
        int[] actualArray1  = {10, 23, 1, 3, 15, 19, 16, 2, 46, 5, 25, 11};
        
        //BubbleSort
        printArray(actualArray1);
        BubbleSort bs = new BubbleSort();
        int[] newArray1 = bs.bubbleSort(actualArray1);
        System.out.println("Bubble Sort.");
        printArray(newArray1);
        System.out.println();

        //InsertionSort
        int[] actualArray2  = {10, 23, 1, 3, 15, 19, 16, 2, 46, 5, 25, 11};
        printArray(actualArray2);
        InsertionSort is = new InsertionSort();
        int[] newArray2 = is.insertionSort(actualArray2);
        System.out.println("Insertion Sort.");
        printArray(newArray2);

        //HeapSort
        int[] actualArray3 = {10, 23, 1, 3, -15, 19, 16, 2, 46, 5, 25, 11};
        printArray(actualArray2);
        HeapSort hs = new HeapSort();
        int[] newArray3 = hs.heapSort(actualArray3);
        System.out.println("Heap Sort.");
        printArray(newArray3);
    }

    public static void printArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}