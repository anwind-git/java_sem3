//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dz1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.removeIf(i -> i % 2 == 0);
        System.out.print(list);
    }
}