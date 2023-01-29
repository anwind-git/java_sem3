import java.util.Arrays;

public class dz3 {
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];
    
            // заполняем левую и правую части массива
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
                System.out.println(Arrays.toString(left));
            }
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
                System.out.println(Arrays.toString(right));
            }
    
            // сортируем левую и правую часть
            mergeSort(left);
            mergeSort(right);
    
            // слияние
            merge(left, right, array);
        }
    }
    
    public static void merge(int[] left, int[] right, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;
    
        while (leftIndex < left.length && rightIndex < right.length) {
            // сравниваем элементы в левой и правой части и добавляем меньший в массив
            if (left[leftIndex] < right[rightIndex]) {
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
    
        // добавляем оставшиеся элементы из левой и правой частей
        while (leftIndex < left.length) {
            array[arrayIndex] = left[leftIndex];
            leftIndex++;
            arrayIndex++;
        }
        while (rightIndex < right.length) {
            array[arrayIndex] = right[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {5, 12, 32, 44, 15};
        System.out.println("Исходный массив: " + Arrays.toString(myArray));
    
        mergeSort(myArray);
        System.out.println("Отсортированный массив: " + Arrays.toString(myArray));
    }
}
