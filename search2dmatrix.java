import java.util.Arrays;

public class search2dmatrix {
    private static int[]binarySearch(int [][]arr,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(target==arr[row][mid]){
                return new int[]{row,mid};
            }
            else if(target<arr[row][mid]){
                cstart=mid+1;
            }
            else{
                cend=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    private static boolean findtarget(int [][]arr,int target) {
        int numberOfrows = arr.length;
        int numberOfcolumn = arr[0].length;
        //after deducing the number of rows into one apply binarysearch on 1d
        //if rows are equal to one
        int start=0;
        int end=(numberOfrows*numberOfcolumn)-1;
        //to get rows=mid/col
        //to get col do mid%col as mid range=[0,cols]
        while(start<=end){
            int mid=(start+end)/2;
            int element=arr[mid/numberOfcolumn][mid%numberOfcolumn];
            if(element==target){
                return true;
            }
            else if(target>element){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]arr=
                {{10, 11, 12, 13},
                {14, 15, 16, 17},
                {27, 29, 30, 31},
                {32, 33, 39, 80}};
        int target=10;
        System.out.println(findtarget(arr,target));
          }
    }


/*          10
         l,m  {{10, 11, 12, 13},             1
          h {14, 15, 16, 17},               2
           {27, 29, 30, 31},              3
            {32, 33, 39, 80}};              4
 */