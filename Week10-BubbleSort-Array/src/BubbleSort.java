import java.util.Arrays;

public class BubbleSort {
    int[] list = {5, 3, 8, 4, 2};

    void Sort(int[] list){
        for(int i = 0; i < list.length - 1; i++) { //OUTER LOOP, NUMBER OF PASSES/LOOPS
            for (int j = 0; j < list.length - 1 - i; j++) { //INNER LOOP TO COMPARE ADJACENT VALUES.
                // -1 - i because after each full pass, biggest number "bubbles to the end",
                // doesn't need to check last element again
                if (list[j] > list[j + 1]) {
                    int swap = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.list));
        bs.Sort(bs.list);
        System.out.println(Arrays.toString(bs.list));

    }

}