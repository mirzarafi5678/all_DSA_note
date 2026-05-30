import java.util.Arrays;

class solution{

    void quickSort(int[] arr , int l , int r){
         if ( l < r ) {
             int pivot = partition(arr , l , r);

                quickSort(arr, l , pivot-1);
                quickSort(arr , pivot+1, r);
         }

    }
    int partition (int [] arr , int l , int r ){
        int pivot = arr[r];
        int i = l-1;


        for (int j = l; j < r ; j++) {
            if (arr[j]< pivot) {
                i=i+1;
                int temp = arr[j];
                arr [j] = arr [i];
                arr[i] = temp;

            }
        }
        int temp = arr[i+1];
        arr [i +1] = pivot;
        arr [ r] = temp;

        return i+1;
    }


}





public class Main {
    public static void main(String[] args) {
     solution ss = new solution();
     int [] arr = {21,22,1,3,45,3,12,20,4,43};
     ss.quickSort(arr, 0 , arr.length-1);
     System.out.println(Arrays.toString(arr));

    }


}

