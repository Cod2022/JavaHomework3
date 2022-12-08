import java.util.ArrayList;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка
 */

public class TaskIII {
    ArrayList<Integer> myArray = new ArrayList<>();
    int max = 0;
    int min = 0;
    int count = 0;

    public void MaxMin () {
        myArray.add(8);
        myArray.add(23);
        myArray.add(2);
        myArray.add(49);
        myArray.add(7);
        myArray.add(55);

        for (int i = 0; i < myArray.size(); i++) {
            if (max < myArray.get(i)) {
                max = myArray.get(i); 
            }
        }
        min = myArray.get(0);
        for (int i = 0; i < myArray.size(); i++) {
            count = count + myArray.get(i);
            if (myArray.get(i) < min) {
                min = myArray.get(i);
            }
        }
    
        System.out.println("Исходная коллекция: " + myArray);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее арифметическое: " + count/myArray.size());
    }
    
    




}
