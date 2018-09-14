public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++)
            swap(i, findMin(i,a),a);
    }

    private int findMin(int from, int[] a) {
        int min = from;
        for (int k = from + 1; k < a.length; k++)
            if (a[k] < a[min])
                min = k;
        return min;
    }

    private void swap(int a, int b, int[] c) {
        int temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
