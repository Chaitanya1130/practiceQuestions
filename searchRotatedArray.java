package searching_sorting;

public class searchRotatedArray {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // first check if the left half is sorted or not
            else if (arr[mid] >= arr[start]) {
                // if it is, then cehck if the element is present or not
                // if yes then proceed bring end pointer to mid-1
                if (target <= arr[mid] && target >= arr[start]) {
                    end = mid - 1;
                }
                // if no, then the element is present in the second half so do start =mid+1
                else {
                    start = mid + 1;
                }
            }
            // if left half is not sorted then check half
            else {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,1,2};
        int target=4;
        int result=search(arr,target);
        System.out.println( result);
    }
}
