/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.ArrayList;

public class TaskII {

    ArrayList<Integer> numbers = new ArrayList<>();
    // Iterator<Integer> iterator = numbers.iterator();
    
    public void delEven() {
        numbers.add(4);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Исходная коллекция: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("Без чётных чисел: " + numbers);

    }
}
