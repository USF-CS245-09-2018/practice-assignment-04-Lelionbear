public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
//        for (int j = 0; j < a.length-1; j++)
//            for (int i = 0; i < a.length - 1; i++){
//                if (a[i] > a[i+1])
//                    swap(i,i+1,a);
//            }
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < a.length - j; i++) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1, a);
                    swapped = true;
                }
            }
        }
    }

    private void swap(int a, int b, int[] c) {
        int temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
