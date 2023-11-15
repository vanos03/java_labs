import java.util.List;
import java.util.Collections;

public class simple_sort {
    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }
    public static<T extends Comparable<T>> void bubbleSort(List<T> list, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= 0 && key.compareTo(list.get(j)) < 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
    public static <T extends Comparable<T>> void insertionSort(List<T> list, int start, int end) {
        for (int i = start; i < end; i++) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= start && key.compareTo(list.get(j)) < 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static <T extends Comparable<T>> void selectionSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(list, i, minIndex);
        }
    }

    public static <T extends Comparable<T>> void selectionSort(List<T> list, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < end; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(list, i, minIndex);
        }
    }

}