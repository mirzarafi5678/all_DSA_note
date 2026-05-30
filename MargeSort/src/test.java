import java.util.Arrays;

class solution {
    void marge (int [] arr , int l ,int r){
        if (l<r){
         int m = l+ (r-l)/2 ;
         marge (arr , l , m);
         marge (arr , m+1 , r);

         mergesort(arr , l , m , r);
        }
    }
    void mergesort(int []arr , int l , int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            b[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;

            } else {

                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = b [j] ;
            k++;
            j++;
        }

    }

}



public class test {

    public static void main(String[] args) {
        int []  arr = {21,11,34,2,45,6,45,7,66,4,12};
        solution ss = new solution();

        ss.marge(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
