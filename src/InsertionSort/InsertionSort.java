package InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        //создаем и заполняем неотсортированный массив из 20-ти чисел
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * (200 + 1)) - 100;
            list.add(a);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        //Алгортим сортировки "вставками""
       /* 1. Двигаемся последовательно по элементам массива (i + 1);
        2. Сравниваем текущее число X(n) и последующее X(n+1).
        3. Если Xn > Xn+1 - правое переставляем сразу на свое место относительно проверенных чисел
        */
        int buffer = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    buffer = list.get(i);
                    list.set(list.get(i), list.get(j));
                }
            }
        }
        //Выводим отсортированный массив
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
