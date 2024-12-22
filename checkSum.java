package searching_sorting;
import java.util.*;
public class checkSum {
    static List<int[]> checksum(int[]arr, int target){


        Map<Integer,Integer> check=new HashMap<>();
        List<int[]> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int secondValue=target-arr[i];
            if(check.containsKey(secondValue)){
                result.add(new int[]{secondValue,arr[i]});

            }
            check.put(arr[i],i);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<int[]> result=  checksum(arr,target);
        if(result.isEmpty()){
            System.out.println("no result");

        }
        for(int[]i:result){
            System.out.println(Arrays.toString(i));

        }
    }
}
