// Реализовать алгоритм сортировки слиянием

public class TaskI {
    
    public void mergeSortArr(int[] myArr) {
        int l = myArr.length;
        if(l == 1) return;
        int half = l / 2;
        int[] left = new int[half];
        int[] right = new int[l - half];

        for (int i = 0; i < half; i++) {
            left[i] = myArr[i];
        }
        for (int i = 0; i < l - half; i++) {
            right[i] = myArr[i + half]; 
        }

        mergeSortArr(left);
        mergeSortArr(right);
        merge(myArr, left, right);
    }

    public void merge(int[] myArr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < l && j < r) {
            if(left[i] < right[j]) {
              myArr[idx] = left[i];
              i++;
            } else {
               myArr[idx] = right[j];
               j++;
            }
            idx++;
        }

        for (int ll = i; ll < l; ll++ ) {
            myArr[idx++] = left[ll];
        }

        for (int rr = j; rr < r; rr++) {
            myArr[idx++] = right[rr];
        }

    }

    public void printArrI(int[] myArr) {
        System.out.print("Исходный массив: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }

    public void printArrII(int[] myArr) {
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }

    
}
