public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int[] myArr = {2, 9, 7, 6, 3, 4, 5, 1};
        TaskI taskI = new TaskI();
        taskI.printArrI(myArr);
        taskI.mergeSortArr(myArr);
        System.out.println();
        taskI.printArrII(myArr);

        System.out.println();
        System.out.println();
        System.out.println("Задача 2.");
        TaskII taskII = new TaskII();
        taskII.delEven();

        System.out.println();
        System.out.println("Задача 3.");
        TaskIII taskIII = new TaskIII();
        taskIII.MaxMin();

    }
}
