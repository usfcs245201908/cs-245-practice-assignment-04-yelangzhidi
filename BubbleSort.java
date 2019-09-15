public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        boolean Swapped = true;
        while(Swapped){
            Swapped = false;
            for (int i = 0; i< a.length-1; i++){
                if(a[i]>a[i+1]){
                    swap(a, i, i+1);
                    Swapped = true;
                }
            }
        }
    }

    void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
