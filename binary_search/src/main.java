class Solution{

    int binarySearch (int [] arr , int key ){

        int l= 0;
        int r = arr.length-1;

        while  ( l <=r ){
              int mid = l + (r-l) /2 ;
              if (arr [mid]== key){
                  return mid;
              }
              else if (arr [mid] < key) {
                  l = mid+1;
              }else {
                  r = mid-1;
            }
        }
        return -1;
    }


}


public class main {

    public static void main(String[] args) {
        Solution ss = new Solution() ;
        int []arr = {1, 2, 3, 4, 5, 6, 21};
        System.out.println(ss.binarySearch(arr, 21));



    }

}