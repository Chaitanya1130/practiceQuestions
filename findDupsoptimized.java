import java.util.*;
public class findDupsoptimized {
    private static List<Integer> findDups(int []arr){
        List<Integer> list=new ArrayList<>();
        int [] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i:freq){
            System.out.print(freq[i]+" ");
        }
        for(int i=0;i<= arr.length;i++){
            if(freq[i]>1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,1};
        List<Integer> res=findDups(arr);
        System.out.println(res);
    }
}
