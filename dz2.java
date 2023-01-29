//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dz2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(22, 13, 1, 7, 55, 4, 71, 2, 17));
 
        int min = Collections.min(list); 
        int max = Collections.max(list); 
 
        double average; 
        int sum = 0; 
 
        for (int number : list) { 
            sum += number; 
        } 
        average = (double)sum / list.size(); 

        System.out.println("Минимальное число: " + min); 
        System.out.println("Максимальное число: " + max); 
        System.out.println("Среднее арифметическое: " + average);
    }
}
