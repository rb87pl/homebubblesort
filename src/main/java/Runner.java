import java.util.Arrays;

public class Runner {
    static  int[] table = {21, 44, 2, 12, 54, 1, 0, 91, 10};

    public static void  bubbleSort(int[] table) {
        int swap = 1;
        int temp;
        while (swap > 0)
            swap=0;
            for (int i = 0; i < table.length-1 ; i++) {
                if (table[i] > table[i + 1]) {
                    temp = table[i];
                    table[i] = table[i+1];
                    table[i + 1] = temp;
                    swap++;
                }
            }
    }

    public static void printArray() {
        for (int i = 0; i < table.length; i++){
            System.out.println(table[i]);
        }
    }

    public static void main(String[] args) {


        bubbleSort(table);
        System.out.println("Tablica posortowana");
        printArray();
    }
}


