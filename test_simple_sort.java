import java.util.ArrayList;
import java.util.List;

public class test_simple_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        List<Integer> listCopy = new ArrayList<>();
        for (int num : arr) {
            listCopy.add(num);
        }

        simple_sort.bubbleSort(listCopy);
        System.out.println("Пузырьковая сортировка: " + listCopy);
        simple_sort.bubbleSort(listCopy, 1,5);
        System.out.println("Пузырьковая сортировка подстроки: " + listCopy);

        simple_sort.insertionSort(listCopy);
        System.out.println("Сортировка вставками: " + listCopy);
//        simple_sort.insertionSort(listCopy,1,6);
//        System.out.println("Сортировка вставками подстроки: " + listCopy);

        simple_sort.selectionSort(listCopy);
        System.out.println("Сортировка выбором: " + listCopy);
//        simple_sort.selectionSort(listCopy,1,5);
//        System.out.println("Сортировка выбором подстроки: " + listCopy);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");

        simple_sort.bubbleSort(stringList);
        System.out.println("Пузырьковая сортировка: " + stringList);

        simple_sort.insertionSort(stringList);
        System.out.println("Сортировка вставками: " + stringList);

        simple_sort.selectionSort(stringList);
        System.out.println("Сортировка выбором: " + stringList);
    }
}

